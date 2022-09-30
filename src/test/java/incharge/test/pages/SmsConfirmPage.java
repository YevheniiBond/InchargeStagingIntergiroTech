package incharge.test.pages;

import incharge.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmsConfirmPage extends BasePage {

    public SmsConfirmPage(WebDriver driver) {
        super(driver);
    }

    private static final String SMS_NUMBER = "//button[@data-testid='sms-nonce']";
    private static final String NUMBER_FIELD = "//input[@inputmode='numeric']";

    public WebElement smsNumber() {
        return waitUntilElementToBeClickable(SMS_NUMBER);
    }

    public WebElement numberField() {
        return waitUntilElementToBeClickable(NUMBER_FIELD);
    }


    public WebElement getNumber() {
        return driver.findElement(By.xpath(SMS_NUMBER));
    }
}