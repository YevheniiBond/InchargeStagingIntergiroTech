package incharge.test.pages;

import incharge.test.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CardDetailsPage extends BasePage {
    public CardDetailsPage(WebDriver driver) {
        super(driver);
    }

    private static final String CARD_NUMBER = "//label[contains(text(),'Card Number')]/following-sibling::p";

    public WebElement cardNumber() {
        return waitUntilVisibilityOfElementLocated(CARD_NUMBER);
    }
}