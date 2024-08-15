package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.SignInPage;
import tek.bdd.utility.SeleniumUtility;

public class SecurityTestSteps extends SeleniumUtility {

    @When("user click on sign in link")
    public void clickOnSignIn() {
        clickOnElement(HomePage.SING_IN_LINK);
    }

    @Then("Validate user is in sign In page")
    public void validateSignInPage() {
        String pageSubtitle = getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("Sign in", pageSubtitle);
    }

    @When("user enter {string} and {string} and click on login")
    public void logInInformation(String username, String password) {
        sendText(SignInPage.EMAIL_INPUT, username);
        sendText(SignInPage.PASSWORD_INPUT, password);
        clickOnElement(SignInPage.LOGIN_BUTTON);

    }

    @Then("user should be able to see account link")
    public void validateLogInSuccessfully() {
        boolean isVisible = elementIsVisible(HomePage.ACCOUNT_LINK);
        Assert.assertTrue(isVisible);

    }

    @Then("user should see error {string}")
    public void userShouldSeeError(String expectedErrorMessage) {
        String actualErrorMessage = getElementText(SignInPage.ERROR_MESSAGE);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }


}