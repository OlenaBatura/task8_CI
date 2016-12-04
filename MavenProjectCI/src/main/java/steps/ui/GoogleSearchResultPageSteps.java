package steps.ui;

import org.testng.Assert;
import pages.GoogleSearchResultPage;

/**
 * Created by Olena_Batura,
 * Date: 22.11.2016,
 * Time: 22:16.
 */
public class GoogleSearchResultPageSteps {
    private static GoogleSearchResultPage googleSearchResultPage = new GoogleSearchResultPage();

    public static void verifyIfSearchResultIsCorrect() {
        Assert.assertTrue(googleSearchResultPage.isWordInResults(GoogleSearchHomePageSteps.getSearchWord()), "Search result does not contain such keyword!");
    }
}
