package tests;

import core.BaseTest;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {
    private LoginPage loginPage;

    @Test
    public void successfulLoginTest() {
        driver.get("https://the-internet.herokuapp.com/login");
        loginPage = new LoginPage(driver);
        loginPage.loginAs("tomsmith", "SuperSecretPassword!");
        String alertText = loginPage.getAlertText();
        assertTrue(alertText.contains("You logged into a secure area!"));
    }
}
