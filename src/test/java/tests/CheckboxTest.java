package tests;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.CheckboxPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckboxTest extends BaseTest {
    private CheckboxPage checkboxPage;

    @BeforeEach
    public void initPage() {
        checkboxPage = new CheckboxPage(driver);
        checkboxPage.openPage();
    }

    @ParameterizedTest(name = "Checkbox #{0} should be {1}")
    @CsvSource({
            "0, true",
            "0, false",
            "1, true",
            "1, false"
    })
    public void parameterizedCheckboxTest(int index, boolean expectedState) {
        checkboxPage.setCheckbox(index, expectedState);
        boolean actualState = checkboxPage.isChecked(index);
        assertEquals(
                expectedState,
                actualState,
                "Checkbox " + index + " must be " + expectedState
        );
    }
}
