package incharge.test.pages;

import org.openqa.selenium.WebDriver;

public class HomePageHelper extends HomePage {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    private String lastCardNumber;

    public void setLastCardNumber() {
        lastCardNumber = lastFourNumber().getText();
    }

    public String getLastCardNumber() {
        return this.lastCardNumber;
    }
}