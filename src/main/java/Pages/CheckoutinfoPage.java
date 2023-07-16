package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutinfoPage {
    public WebDriver driver;

    public CheckoutinfoPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstname = By.id("first-name");
    private By lastname = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continuebutton=By.id("continue");

    public void enterfirstname(String firstnametext) {
        driver.findElement(firstname).sendKeys(firstnametext);
    }
    public void enterlastname(String lastnameText){
        driver.findElement(lastname).sendKeys(lastnameText);
    }
    public void enterpostalcode(String postalcodetext){
        driver.findElement(postalCode).sendKeys(postalcodetext);
    }
    public CheckoutOverviewPage clickoncontinuebutton(){
        driver.findElement(continuebutton).click();
        return new CheckoutOverviewPage(driver);
    }
}
