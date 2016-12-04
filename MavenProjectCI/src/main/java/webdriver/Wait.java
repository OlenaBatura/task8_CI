package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

/**
 * Created by Olena_Batura,
 * Date: 22.11.2016,
 * Time: 21:45.
 */
public class Wait {
    private static WebDriverWait wait = new WebDriverWait(WebDriverContext.getWebDriver(), 15);

    public static boolean waitForTitle(String title) {
        return wait.until(ExpectedConditions.titleIs(title));
    }

    public static boolean waitForWebElementIsDisplayed(WebElement webElement) {
        return wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return webElement.isDisplayed();
            }
        });
    }

    public static void waitWhileElementBeClickable(WebElement webElement) {
        wait.until(elementToBeClickable(webElement));
    }

    public static void waitUntilAlertIsPresent() {
        wait.until(
                ExpectedConditions.alertIsPresent());
    }
}
