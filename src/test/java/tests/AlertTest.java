package tests;

import core.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AlertPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertTest extends BaseTest {
    private WebDriver driver;
    private AlertPage alertPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        alertPage = new AlertPage(driver);
        alertPage.openPage();
    }

    @Test
    public void jsAlertTest() {
        alertPage.clickJSAlert();
        alertPage.acceptAlert();
        assertEquals("You successfully clicked an alert", alertPage.getResultText());
    }

    @Test
    public void jsConfirmDismissTest() {
        alertPage.clickJSConfirm();
        alertPage.dismissAlert();
        assertEquals("You clicked: Cancel", alertPage.getResultText());
    }

    @Test
    public void jsPromptSendTextTest() {
        String input = "Hello!";
        alertPage.clickJSPrompt();
        alertPage.sendTextToAlert(input);
        alertPage.acceptAlert();
        assertEquals("You entered: " + input, alertPage.getResultText());
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
