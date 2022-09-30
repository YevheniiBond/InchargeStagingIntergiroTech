package incharge.test.pages;

import incharge.test.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CodePage extends BasePage {

    public CodePage(WebDriver driver) {
        super(driver);
    }

    private static final String CODE_FIELD = "//div[@class='sc-dSnXvR ifSEbK react-code-input']/child::input";

    public List<WebElement> codeField() {
        return waitUntilElementsToBeClickable(CODE_FIELD);
    }
}