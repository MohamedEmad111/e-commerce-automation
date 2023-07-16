package checkout;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class checkoutTest extends BaseTest {
    @Test
    public void checkoutTest1() throws InterruptedException {
        login_page.enterUsername("standard_user");
        login_page.enterPassword("secret_sauce");
        login_page.clickOnLoginButton();
        homePage.clickonfirstbutton();
        homePage.clickonsecondbutton();
        homePage.clickonthirdbutton();
        homePage.clickonshoppingcarticon();
        shoppingCartPage.clickoncheckoutButton();
        checkoutPage.enterfirstname("mohamed");
        checkoutPage.enterlastname("emad");
        checkoutPage.enterpostalcode("64456");
        checkoutPage.clickoncontinuebutton();
        checkoutOverviewPage.clickonFinishbutton();
        String actaul_result=checkoutCompeletePage.getorderSucessMsg();
        String expected_result="Thank you for your order!";
        assertTrue(actaul_result.contains(expected_result));
        checkoutCompeletePage.screenshot();
    }
}
