package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriver.Wait;
import webdriver.WebDriverContext;

/**
 * Created by Olena_Batura,
 * Date: 22.11.2016,
 * Time: 21:45.
 */
public class GoogleSearchHomePage extends BasePage {
    private static final String GOOGLE_URL = "https://www.google.com.ua";

    @FindBy(name = "q")
    private WebElement searchInput;

    public WebElement getSearchInput() {
        return searchInput;
    }

    public void navigate() {
        WebDriverContext.getWebDriver().get(GOOGLE_URL);
    }

    public void inputSearchWord(String searchWord) {
        searchInput.clear();
        searchInput.sendKeys(searchWord);
        searchInput.sendKeys(Keys.ENTER);
    }

    @Override
    public boolean isLoaded() {
        return Wait.waitForWebElementIsDisplayed(searchInput);
    }
}
