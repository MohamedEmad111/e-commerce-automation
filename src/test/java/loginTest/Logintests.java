package loginTest;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Logintests extends BaseTest {
    @Test(priority = 3)
    public void successful_login(){
        login_page.enterUsername("standard_user");
        login_page.enterPassword("secret_sauce");
        login_page.clickOnLoginButton();
    }
    @Test(priority = 2)
    public void invalidusername(){
        login_page.enterUsername("false");
        login_page.enterPassword("secret_sauce");
        login_page.clickOnLoginButton();
        String actual_result= login_page.getErrorMsg();
        String expected_result="Epic sadface: Username and password do not match any user in this service";
        assertTrue(actual_result.contains(expected_result));
    }
    @Test(priority = 1)
    public void invalidPassword(){
        login_page.enterUsername("standard_user");
        login_page.enterPassword("false");
        login_page.clickOnLoginButton();
        String actual_result= login_page.getErrorMsg();
        String expected_result="Epic sadface: Username and password do not match any user in this service";
        assertTrue(actual_result.contains(expected_result));

}}
