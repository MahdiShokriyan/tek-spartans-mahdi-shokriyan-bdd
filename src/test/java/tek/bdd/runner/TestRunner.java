package tek.bdd.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/ProfilePage.feature",
        glue = "tek.bdd.steps",
        dryRun = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
       // tags = "@Regression",
        plugin = {
                "html:target/cucumber_report/index.html"
        }
)
public class TestRunner {
}
