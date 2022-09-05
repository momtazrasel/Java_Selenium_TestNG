package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTest extends BaseTests {

    @Test
    public void testSuccessfullLogin(){
        LoginPage loginpage =homepage.clickFormAuthentication();
        loginpage.setUsername("tomsmith");
        loginpage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginpage.clickLoginButton();
        Assert.assertEquals(secureAreaPage.getAlertText(), "You logged into a secure area!\n" +
                "×", "Login error");

    }
}
