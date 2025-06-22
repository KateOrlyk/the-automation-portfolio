package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CheckboxPage;

import static org.junit.jupiter.api.Assertions.*;

public class CheckboxTest {
    private WebDriver driver;
    private CheckboxPage checkboxPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        checkboxPage = new CheckboxPage(driver);
        checkboxPage.openPage();
    }

    @ParameterizedTest
    @CsvSource({
            "0, true",
            "0, false",
            "1, true",
            "1, false"
    })
    public void parameterizedCheckboxTest(int index, boolean expectedState) {
        checkboxPage.setCheckbox(index, expectedState);
        boolean actualState = checkboxPage.isChecked(index);
        assertEquals(expectedState, actualState, "Чекбокс " + index + " має бути в стані " + expectedState);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
