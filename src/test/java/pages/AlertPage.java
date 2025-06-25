package pages;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    private WebElement jsAlertButton;

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    private WebElement jsConfirmButton;

    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    private WebElement jsPromptButton;

    @FindBy(id = "result")
    private WebElement resultText;

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open Alert page")
    public void openPage() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    // private low-level clicks
    private void clickJSAlert() {
        click(jsAlertButton);
    }

    private void clickJSConfirm() {
        click(jsConfirmButton);
    }

    private void clickJSPrompt() {
        click(jsPromptButton);
    }

    private Alert switchToAlert() {
        return driver.switchTo().alert();
    }

    // public high-level actions
    @Step("Accept JS Alert")
    public void acceptJSAlert() {
        clickJSAlert();
        switchToAlert().accept();
    }

    @Step("Dismiss JS confirm")
    public void dismissJSConfirm() {
        clickJSConfirm();
        switchToAlert().dismiss();
    }

    @Step("Send text to JS prompt")
    public void sendTextToJSPrompt(String text) {
        clickJSPrompt();
        Alert alert = switchToAlert();
        alert.sendKeys(text);
        alert.accept();
    }

    @Step("Get alert result text")
    public String getResultText() {
        return textOf(resultText);
    }
}
