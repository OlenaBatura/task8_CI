package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Olena_Batura,
 * Date: 22.11.2016,
 * Time: 21:46.
 */
public class WebDriverContext {
    private final static String PATH_TO_CHROMEDRIVER = "src/main/resources/chromedriver.exe";
    private static WebDriver webDriver;

    public static void createWebDriver() {
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void quiteWebDriver() {
        webDriver.quit();
    }
}
