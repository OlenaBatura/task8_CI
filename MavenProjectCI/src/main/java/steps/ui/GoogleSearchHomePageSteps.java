package steps.ui;

import pages.GoogleSearchHomePage;
import pages.GoogleSearchResultPage;

/**
 * Created by Olena_Batura,
 * Date: 22.11.2016,
 * Time: 22:08.
 */
public class GoogleSearchHomePageSteps {

    private static String searchWord = "Hello, world!";

    private static GoogleSearchHomePage googleSearchHomePage = new GoogleSearchHomePage();
    private static GoogleSearchResultPage googleSearchResultPage = new GoogleSearchResultPage();

    public static String getSearchWord() {
        return searchWord;
    }

    public static void navigateToHomePage() {
        googleSearchHomePage.navigate();
        googleSearchHomePage.isLoaded();
    }

    public static void verifyIfSearchCanBePerformed() {
        googleSearchHomePage.inputSearchWord(searchWord);
        googleSearchResultPage.isLoaded();
    }
}
