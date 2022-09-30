package incharge.test.pages;

import org.openqa.selenium.WebDriver;

public class SmsConfirmPageHelper extends SmsConfirmPage {
    public SmsConfirmPageHelper(WebDriver driver) {
        super(driver);
    }

    public void confirmWithSms() {
        numberField().sendKeys(getNumber().getText());
    }
}