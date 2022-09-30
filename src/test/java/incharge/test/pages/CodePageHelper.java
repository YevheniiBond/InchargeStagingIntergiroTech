package incharge.test.pages;

import org.openqa.selenium.WebDriver;

public class CodePageHelper extends CodePage {
    public CodePageHelper(WebDriver driver) {
        super(driver);
    }

    public void enterCode(String confirmPassword) {
        codeField().get(0).sendKeys(confirmPassword);
    }
}