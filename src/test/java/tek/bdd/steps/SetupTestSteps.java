package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @When("user click on sign in link")
    public void clickOnSignIn() {
        clickOnElement(By.id("signinLink"));
    }

    @Then("Validate user is in sign In page")
    public void validateSignInPage() {
        String mathias = getElementText(By.className("login__subtitle"));
        Assert.assertEquals("Sign in", mathias);
    }

    @When("user enter username and password and click on login")
    public void logInInformation() {
        sendText(By.id("email"), "mahdi.mahdi@gmail.com");
        sendText(By.id("password"), "Mahdi123!");
        clickOnElement(By.id("loginBtn"));
    }

    @Then("user should be able to see account link")
    public void validateLogInSuccessfully() {
        boolean isVisible = elementIsVisible(By.id("accountLink"));
        Assert.assertTrue(isVisible);
    }
}
