package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;

    private By jsAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By jsConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By jsPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultText = By.id("result");

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    public void clickJSAlert() {
        driver.findElement(jsAlertButton).click();
    }

    public void clickJSConfirm() {
        driver.findElement(jsConfirmButton).click();
    }

    public void clickJSPrompt() {
        driver.findElement(jsPromptButton).click();
    }

    private Alert switchToAlert() {
        return driver.switchTo().alert();
    }

    public void acceptAlert() {
        switchToAlert().accept();
    }

    public void dismissAlert() {
        switchToAlert().dismiss();
    }

    public void sendTextToAlert(String text) {
        switchToAlert().sendKeys(text);
    }

    public String getResultText() {
        return driver.findElement(resultText).getText().trim();
    }
}
