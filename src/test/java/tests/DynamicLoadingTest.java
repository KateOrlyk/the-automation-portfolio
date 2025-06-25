package tests;

import core.BaseTest;
import org.junit.jupiter.api.Test;
import pages.DynamicLoadingPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicLoadingTest extends BaseTest {
    @Test
    public void example1ShouldLoadHelloWorld() {
        DynamicLoadingPage page = new DynamicLoadingPage(driver);
        page.openPage();
        page.clickStart();
        String text = page.getLoadedText();
        assertEquals(
                "Hello World!",
                text,
                "Loaded text should be 'Hello World!'");
    }
}
