package pages;

import org.openqa.selenium.support.PageFactory;
import webdriver.WebDriverContext;


/**
 * Created by Olena_Batura,
 * Date: 22.11.2016,
 * Time: 21:45.
 */
abstract public class BasePage {
    public BasePage() {
        PageFactory.initElements(WebDriverContext.getWebDriver(), this);
    }

    public abstract boolean isLoaded();
}
