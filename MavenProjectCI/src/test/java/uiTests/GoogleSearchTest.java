package uiTests;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import steps.ui.GoogleSearchHomePageSteps;
import steps.ui.GoogleSearchResultPageSteps;
import webdriver.WebDriverContext;

/**
 * Created by Olena_Batura,
 * Date: 22.11.2016,
 * Time: 22:07.
 */

public class GoogleSearchTest {
    @Before
    public static void setUp() {
        WebDriverContext.createWebDriver();
    }

    @Given("^I navigate to Google home page$")
    public void testIfGoogleSearchPageCanBeOpened() {
        GoogleSearchHomePageSteps.navigateToHomePage();
    }

    @And("^I enter key word into search field$")
    public void testIfSearchCanBePerformed() {
        GoogleSearchHomePageSteps.verifyIfSearchCanBePerformed();
    }

    @Then("^I check if search results are correct$")
    public void testIfSearchIsSuccessfull() {
        GoogleSearchResultPageSteps.verifyIfSearchResultIsCorrect();
    }

    @After
    public static void shutDown() {
        WebDriverContext.quiteWebDriver();
    }

}
