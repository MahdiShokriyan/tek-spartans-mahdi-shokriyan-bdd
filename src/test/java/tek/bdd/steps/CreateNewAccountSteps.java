package tek.bdd.steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import tek.bdd.pages.SignInPage;
import tek.bdd.pages.SignUpPage;
import tek.bdd.utility.RandomEmailGenerator;
import tek.bdd.utility.SeleniumUtility;

public class CreateNewAccountSteps extends SeleniumUtility {

    @When("user click on Create New Account Button")
    public void createNewAccountBtn() {
        clickOnElement(SignInPage.CREATE_NEW_ACCOUNT);
    }

    @Then("Validate user is in {string} page")
    public void userIsInSignUpPage(String expectedResult) {
        String actualResult = getElementText(SignUpPage.SIGN_UP_SUBTITLE);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @When("user enter {string} and {string} and {string} and {string} and  click on sign up link")
    public void userFillTheSignUpForm(String name, String email, String password,
                                      String confirmPassword) {
        var random = new RandomEmailGenerator();
        sendText(SignUpPage.ENTER_NAME, name);
        sendText(SignUpPage.ENTER_EMAIL, random.RandomEmailGenerator(email));
        sendText(SignUpPage.ENTER_PASSWORD, password);
        sendText(SignUpPage.ENTER_CONFIRM_PASSWORD, confirmPassword);
        clickOnElement(SignUpPage.SIGN_UP_BTN);
    }

}
