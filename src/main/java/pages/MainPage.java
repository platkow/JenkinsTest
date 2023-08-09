package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }
    private Logger logger = LoggerFactory.getLogger("BasePage.class");

    @FindBy(xpath = "//div[@id='RA-root']//div[@class='ant-col']/div[@class='ant-row ant-row-center gfg_home_page_search_heading']")
    private WebElement title;

    public String getTitle() {
        logger.info("Getting text from element");
        return title.getText();
    }
}
