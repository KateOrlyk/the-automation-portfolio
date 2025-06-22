package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxPage {
    private WebDriver driver;

    private By checkboxes = By.cssSelector("#checkboxes input");

    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    public List<WebElement> getAllCheckboxes() {
        return driver.findElements(checkboxes);
    }

    public void setCheckbox(int index, boolean value) {
        WebElement checkbox = getAllCheckboxes().get(index);
        if (checkbox.isSelected() != value) {
            checkbox.click();
        }
    }

    public boolean isChecked(int index) {
        return getAllCheckboxes().get(index).isSelected();
    }
}
