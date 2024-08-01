package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SecurityTestSteps extends SeleniumUtility {

    @When("user click on sign in link")
    public void clickOnSignIn() {
        clickOnElement(By.id("signinLink"));
    }

    @Then("Validate user is in sign In page")
    public void validateSignInPage() {
        String signIn = getElementText(By.className("login__subtitle"));
        Assert.assertEquals("Sign in", signIn);
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
