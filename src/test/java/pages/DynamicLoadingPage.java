package pages;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoadingPage extends BasePage {

    @FindBy(css = "#start button")
    private WebElement startButton;

    @FindBy(css = "#finish h4")
    private WebElement resultText;

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open dynamic page")
    public void openPage() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
    }

    @Step("Click Start Button")
    public void clickStart() {
        click(startButton);
    }

    @Step("Get loaded text result")
    public String getLoadedText() {
        return textOf(resultText);
    }

}
