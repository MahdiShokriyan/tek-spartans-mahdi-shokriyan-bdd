package tek.bdd.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "tek.bdd.steps",
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
       tags = "",
        plugin = {
                "html:target/cucumber_report/index.html",
                "json:target/jsonReport/report.json"
        }
)
public class TestRunner {



}
