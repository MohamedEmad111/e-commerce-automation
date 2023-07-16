package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    private By userName =By.id("user-name");
    private By password = By.id("password");
    private By loginButton=By.id("login-button");
    private By errorMsg=By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3");

    public void enterUsername(String usernameText){
        driver.findElement(userName).sendKeys(usernameText);
    }
    public void enterPassword(String passwordText){
        driver.findElement(password).sendKeys(passwordText);
    }
    public HomePage clickOnLoginButton(){
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }

    public String getErrorMsg(){
        String text=driver.findElement(errorMsg).getText();
        return text;
    }
}
