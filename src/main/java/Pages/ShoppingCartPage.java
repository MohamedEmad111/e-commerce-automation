package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    public WebDriver driver;
    public ShoppingCartPage(WebDriver driver) {
        this.driver=driver;
    }
    private By checkoutButton = By.id("checkout");
    public CheckoutinfoPage clickoncheckoutButton(){
        driver.findElement(checkoutButton).click();
        return new CheckoutinfoPage(driver);
    }
}

