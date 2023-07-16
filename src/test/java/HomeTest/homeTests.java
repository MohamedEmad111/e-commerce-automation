package HomeTest;

import Base.BaseTest;
import org.testng.annotations.Test;

public class homeTests extends BaseTest {
    @Test
    public void chooseElement() throws InterruptedException {
        login_page.enterUsername("standard_user");
        login_page.enterPassword("secret_sauce");
        login_page.clickOnLoginButton();
        homePage.clickonfirstbutton();
        homePage.clickonsecondbutton();
        homePage.clickonthirdbutton();
        homePage.clickonshoppingcarticon();
    }
}
