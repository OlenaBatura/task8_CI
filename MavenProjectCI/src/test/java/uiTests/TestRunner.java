package uiTests; /**
 * Created by: Olena_Batura,
 * Date:  12/1/2016,
 * Time: 12:20 PM.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = {}, format = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"},
        features = {"src/test/resources/GoogleSearchStory.feature"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
