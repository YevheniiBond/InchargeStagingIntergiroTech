package incharge.test.base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.testng.Assert.fail;

abstract public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected final Logger log;
    protected Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        this.log = LogManager.getLogger(this.getClass());
        this.actions = new Actions(driver);
    }

    public WebElement waitUntilVisibilityOfElementLocated(String locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        } catch (WebDriverException e) {
            log.error("No visibility element: " + locator);
            fail("No visibility element: " + locator);
            return null;
        }
    }

    public WebElement waitUntilElementToBeClickable(String locator) {
        try {
            return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        } catch (WebDriverException e) {
            log.error("No clickable element: " + locator);
            fail("No clickable element: " + locator);
            return null;
        }
    }

    public List<WebElement> waitUntilVisibilityOfElementsLocated(String locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            return driver.findElements(By.xpath(locator));
        } catch (WebDriverException e) {
            log.error("No visibility elements: " + locator);
            fail("No visibility elements: " + locator);
            return null;
        }
    }

    public List<WebElement> waitUntilElementsToBeClickable(String locator) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
            return driver.findElements(By.xpath(locator));
        } catch (WebDriverException e) {
            log.error("No clickable elements: " + locator);
            fail("No clickable elements: " + locator);
            return null;
        }
    }

    public void waitUntilInvisibilityOfElement(WebElement element) {
        try {
            wait.until(ExpectedConditions.invisibilityOf(element));
        } catch (WebDriverException e) {
            log.error("Element is visible: " + element);
            fail("Element is visible: " + element);
        }
    }

    public void moveCursor(WebElement element) {
        actions.moveToElement(element).perform();
    }
}