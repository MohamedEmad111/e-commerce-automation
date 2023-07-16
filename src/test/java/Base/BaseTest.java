package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;
    public LoginPage login_page;
    public ShoppingCartPage shoppingCartPage;
    public CheckoutinfoPage checkoutPage;
    public CheckoutOverviewPage checkoutOverviewPage;
  public checkoutCompeletePage checkoutCompeletePage;
public HomePage  homePage;
    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        login_page=new LoginPage(driver);
        homePage=new HomePage(driver);
        shoppingCartPage=new ShoppingCartPage(driver);
        checkoutPage=new CheckoutinfoPage(driver);
        checkoutOverviewPage=new CheckoutOverviewPage(driver);
     checkoutCompeletePage =new checkoutCompeletePage(driver);
        go_home();
    }

    @BeforeMethod
    public void go_home() {
        driver.get("https://www.saucedemo.com/checkout-step-one.html");
    }
    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
