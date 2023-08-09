package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import testbase.TestBase;

public class PageTitleTest extends TestBase {
    private String mainPageUrl = "https://www.geeksforgeeks.org/";
    private MainPage mainPage = new MainPage(driver);

    @Tag("Title")
    @Test
    public void shouldCheckMainPageTitle() {
        String expectedTitle = "Hello, What Do You Want To Learn?";
        String actualTitle;
        driver.get(mainPageUrl);
        actualTitle = mainPage.getTitle();

        Assertions.assertEquals(expectedTitle, actualTitle);
    }
}
