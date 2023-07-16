package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
    public WebDriver driver;
    public CheckoutOverviewPage(WebDriver driver) {
        this.driver=driver;
    }
    private By finshbutton= By.id("finish");
    public checkoutCompeletePage clickonFinishbutton(){
        driver.findElement(finshbutton).click();
        return new checkoutCompeletePage(driver);
    }
}
