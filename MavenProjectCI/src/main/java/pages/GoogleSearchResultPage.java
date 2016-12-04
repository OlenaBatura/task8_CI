package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriver.Wait;

import java.util.List;


/**
 * Created by Olena_Batura,
 * Date: 22.11.2016,
 * Time: 21:45.
 */
public class GoogleSearchResultPage extends BasePage {

    @FindBy(xpath = "//div[@role = 'navigation' and @id='hdtb']")
    private WebElement headerMenu;

    @FindBy(xpath = "//div[@class='g']")
    private List<WebElement> searchResults;

    public boolean isWordInResults(String searchWord) {
        boolean result = false;
        for (WebElement word : searchResults) {
            if (word.getText().contains(searchWord)) {
                result = true;
            }
        }

        return result;
    }

    @Override
    public boolean isLoaded() {
        return Wait.waitForWebElementIsDisplayed(headerMenu);
    }
}
