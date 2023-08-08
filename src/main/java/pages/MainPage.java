package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='RA-root']//div[@class='ant-col']/div[@class='ant-row ant-row-center gfg_home_page_search_heading']")
    private WebElement title;

    public String getTitle() {
        return title.getText();
    }
}
