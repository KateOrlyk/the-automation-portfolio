package tests;

import core.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginNegativeTest extends BaseTest {
    private LoginPage loginPage;

    @ParameterizedTest
    @CsvSource({
            "tomsmith, wrongpass, Your password is invalid!",
            "invalid, SuperSecretPassword!, Your username is invalid!",
            "'', '', Your username is invalid!"
    })
    public void negativeLoginTest(String username, String password, String expectedMessage) {
        driver.get("https://the-internet.herokuapp.com/login");
        loginPage = new LoginPage(driver);
        loginPage.loginAs(username, password);
        String actualAlert = loginPage.getAlertText();
        System.out.println("ALERT: " + actualAlert);
        assertTrue(actualAlert.contains(expectedMessage),
                "Очікували повідомлення: " + expectedMessage + ", але отримали " + actualAlert);
    }
}
