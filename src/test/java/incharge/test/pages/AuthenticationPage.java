package incharge.test.pages;

import incharge.test.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationPage extends BasePage {
    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    private static final String CONFIRM_BTN = "//button[@class='sc-crzoAE ceXlkG']";

    public WebElement confirmBtn() {
        return waitUntilElementToBeClickable(CONFIRM_BTN);
    }
}