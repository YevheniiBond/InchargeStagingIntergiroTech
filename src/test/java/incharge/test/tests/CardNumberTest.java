package incharge.test.tests;

import incharge.test.base.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import incharge.test.pages.*;
import incharge.test.utils.DataProviderCredential;

public class CardNumberTest extends TestInit {
    private final String URL = "https://app.stage.inchargecard.com/log-in";

    @Test(dataProvider = "inputDetails", dataProviderClass = DataProviderCredential.class)
    public void cardNumberTest(String email, String accountPassword, String confirmPassword){

        LoginPageHelper loginPage = new LoginPageHelper(driver);
        HomePageHelper homePage = new HomePageHelper(driver);
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        CodePageHelper codePage = new CodePageHelper(driver);
        SmsConfirmPageHelper smsConfirmPage = new SmsConfirmPageHelper(driver);
        CardDetailPageHelper cardDetailPage = new CardDetailPageHelper(driver);

        openUrl(URL);
        loginPage.login(email, accountPassword)
                 .loginMeInButton().click();
        homePage.popUpNotNowBtn().click();
        homePage.waitUntilInvisibilityOfElement(homePage.popUpNotNowBtn());
        homePage.dotScrollBar().click();
        homePage.setLastCardNumber();
        homePage.cardDetailsBtn().click();
        authenticationPage.confirmBtn().click();
        codePage.enterCode(confirmPassword);
        smsConfirmPage.confirmWithSms();
        cardDetailPage.setCardNumber();

        Assert.assertTrue(cardDetailPage.getCardNumber().endsWith(homePage.getLastCardNumber()));
    }
}