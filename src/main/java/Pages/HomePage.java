package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstbutton = By.id("add-to-cart-sauce-labs-backpack");
    private By secondbutton = By.id("add-to-cart-sauce-labs-bike-light");
    private By thirdbutton = By.id("add-to-cart-sauce-labs-bolt-t-shirt");

    private By shoppingcarticon=By.className("shopping_cart_link");

    public void clickonfirstbutton(){
        driver.findElement(firstbutton).click();
    }
    public void clickonsecondbutton(){
        driver.findElement(secondbutton).click();
    }
    public void clickonthirdbutton(){
        driver.findElement(thirdbutton).click();
    }
    public ShoppingCartPage clickonshoppingcarticon(){
        driver.findElement(shoppingcarticon).click();
        return new ShoppingCartPage(driver);
    }

}
