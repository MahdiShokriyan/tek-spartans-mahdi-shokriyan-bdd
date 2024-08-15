package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;


public class SetupTestSteps extends SeleniumUtility {

  /*  @Given("Open the browser and navigate to retail app")
    public void openBrowserAndNavigate() {
        setupBrowser();
    }*/

    @Then("validate top left corner is TEKSCHOOL")
    public void validateTopCorner() {
        String text = getElementText(By.xpath("//a[text()= 'TEKSCHOOL']"));
        Assert.assertEquals("TEKSCHOOL", text);
    }

    /* @Then("Close the browser")
     public void closeBrowser() {
         quitBrowser();
     }*/

    @Then("Validate Sign in Button is Enabled")
    public void validateSignInButtonEnabled() {
        boolean isButtonEnable = isElementEnabled(By.id("signinLink"));
        Assert.assertTrue(isButtonEnable);
    }

}
