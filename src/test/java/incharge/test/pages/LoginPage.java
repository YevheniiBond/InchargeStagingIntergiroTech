package incharge.test.pages;

import incharge.test.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private static final String INPUT_EMAIL = "//input[@name='email']";
    private static final String INPUT_PASSWORD = "//input[@name='password']";
    private static final String LOG_ME_IN_BUTTON = "//button[@type='submit']";

    public WebElement inputEmail() {
        return waitUntilVisibilityOfElementLocated(INPUT_EMAIL);
    }

    public WebElement inputPassword() {
        return waitUntilVisibilityOfElementLocated(INPUT_PASSWORD);
    }

    public WebElement loginMeInButton() {
        return waitUntilVisibilityOfElementLocated(LOG_ME_IN_BUTTON);
    }
}