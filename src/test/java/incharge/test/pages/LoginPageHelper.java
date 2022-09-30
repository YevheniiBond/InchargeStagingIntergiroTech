package incharge.test.pages;

import org.openqa.selenium.WebDriver;

public class LoginPageHelper extends LoginPage {
    public LoginPageHelper(WebDriver driver) {
        super(driver);
    }

    public LoginPageHelper login(String email, String accountPassword) {
        inputEmail().sendKeys(email);
        inputPassword().sendKeys(accountPassword);
        return this;
    }
}