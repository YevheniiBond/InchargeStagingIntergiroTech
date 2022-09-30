package incharge.test.pages;

import org.openqa.selenium.WebDriver;

public class CardDetailPageHelper extends CardDetailsPage {
    public CardDetailPageHelper(WebDriver driver) {
        super(driver);
    }

    private String cardNumber;

    public void setCardNumber() {
        cardNumber = cardNumber().getText();
    }

    public String getCardNumber() {
        return this.cardNumber;
    }
}