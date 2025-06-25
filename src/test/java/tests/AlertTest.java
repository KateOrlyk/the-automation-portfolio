package tests;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.AlertPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertTest extends BaseTest {
    private AlertPage alertPage;

    @BeforeEach
    public void initPage() {
        alertPage = new AlertPage(driver);
        alertPage.openPage();
    }

    @Test
    public void jsAlertTest() {
        alertPage.acceptJSAlert();                  // instead of alertPage.acceptAlert()
        assertEquals("You successfully clicked an alert", alertPage.getResultText());
    }

    @Test
    public void jsConfirmDismissTest() {
        alertPage.dismissJSConfirm();               // instead of alertPage.dismissAlert()
        assertEquals("You clicked: Cancel", alertPage.getResultText());
    }

    @Test
    public void jsPromptSendTextTest() {
        String input = "Hello!";
        alertPage.sendTextToJSPrompt(input);        // instead of alertPage.sendTextToAlert(input)
        assertEquals("You entered: " + input, alertPage.getResultText());
    }
}
