package tek.bdd.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/SecurityTest.feature",
        glue = "tek.bdd.steps"
)
public class TestRunner {
}
