package testbase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {
    protected static WebDriver driver;
    private static Logger logger = LoggerFactory.getLogger("TestBase.class");

    public static WebDriver getDriver() {
        return driver;
    }

    public static Logger getLogger() {
        return logger;
    }

    @BeforeAll
    static void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        logger.debug(" ---------- Driver initialization complete ---------- ");
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
        logger.debug("Driver quit");
        logger.info(" ----------  End test  ---------- ");
    }
}

