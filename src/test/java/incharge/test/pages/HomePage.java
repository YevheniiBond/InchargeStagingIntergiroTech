package incharge.test.pages;

import incharge.test.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String POP_UP_NOT_NOW = "//button[@class='btn-text btn-md  active:scale-[.95] flex items-center']";
    private static final String CARD_DETAILS_BUTTON = "//div[@data-projection-id='2']";
    private static final String DOT_LIST = "//div[@class='h-2 w-2 cursor-pointer rounded-full'][3]";
    private static final String LAST_FOUR_NUMBER = "//div[@class='bg-black z-10 flex h-full w-full flex-col justify-between rounded-xl p-5 pb-6 ']//span";

    public WebElement cardDetailsBtn() {
        return waitUntilElementToBeClickable(CARD_DETAILS_BUTTON);
    }

    public WebElement popUpNotNowBtn() {
        return waitUntilElementToBeClickable(POP_UP_NOT_NOW);
    }

    public WebElement dotScrollBar() {
        return waitUntilElementToBeClickable(DOT_LIST);
    }

    public WebElement lastFourNumber() {
        return waitUntilVisibilityOfElementLocated(LAST_FOUR_NUMBER);
    }
}