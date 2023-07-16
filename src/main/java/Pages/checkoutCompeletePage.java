package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class checkoutCompeletePage {
    public WebDriver driver;
    public checkoutCompeletePage(WebDriver driver) {
        this.driver=driver;
    }
private By orderSucessMsg= By.cssSelector("#checkout_complete_container > h2");
    public String getorderSucessMsg(){
       String text = driver.findElement(orderSucessMsg).getText();
       return text;
    }
    public void screenshot() {
        File screenshot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot1, new File("E:\\Java_Projects\\e-commerce\\1.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
