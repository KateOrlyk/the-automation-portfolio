package pages;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckboxPage extends BasePage {

    @FindBy(css = "#checkboxes input")
    private List<WebElement> checkboxes;

    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open Checkboxes page")
    public void openPage() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @Step("Set checkbox #{index} to {value}")
    public void setCheckbox(int index, boolean value) {
        WebElement checkbox = checkboxes.get(index);
        if (checkbox.isSelected() != value) {
            click(checkbox);
        }
    }

    @Step("Get state of checkbox #{index}")
    public boolean isChecked(int index) {
        return checkboxes.get(index).isSelected();
    }
}
