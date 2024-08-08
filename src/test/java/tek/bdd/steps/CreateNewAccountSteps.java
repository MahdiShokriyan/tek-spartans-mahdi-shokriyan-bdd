package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.SignInPage;
import tek.bdd.pages.SignUpPage;
import tek.bdd.utility.JavaUtilities;
import tek.bdd.utility.SeleniumUtility;

import java.util.List;
import java.util.Map;

public class CreateNewAccountSteps extends SeleniumUtility {
    private static String gmailRandom;

    @When("user click on Create New Account Button")
    public void createNewAccountBtn() {
        clickOnElement(SignInPage.CREATE_NEW_ACCOUNT);
    }

    @Then("Validate user is in {string} page")
    public void userIsInSignUpPage(String expectedResult) {
        String actualResult = getElementText(SignUpPage.SIGN_UP_SUBTITLE);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @When("user enter {string} and {string} and {string} and click on sign up link")
    public void userFillTheSignUpForm(String name, String email, String password) {

        var random = new JavaUtilities();
        sendText(SignUpPage.ENTER_NAME, name);
        sendText(SignUpPage.ENTER_EMAIL, random.RandomEmailGenerator(email));
        sendText(SignUpPage.ENTER_PASSWORD, password);
        sendText(SignUpPage.ENTER_CONFIRM_PASSWORD, password);
        clickOnElement(SignUpPage.SIGN_UP_BTN);
    }

    @Then("user should be able to see {string}")
    public void existingAccountErrorMessage(String expectedResult) {
        String actualResult = getElementText(SignUpPage.SIGN_UP_ERROR);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @When("user click on Sign Up button")
    public void userClickOnSignUpButton() {

        clickOnElement(SignUpPage.SIGN_UP_BTN);
    }

    @Then("Validate the errors")
    public void validateTheErrors(DataTable dataTable) {
        Map<String , String> mathias = dataTable.asMap();
        List<WebElement> list = getElements(By.cssSelector(".error"));


        Assert.assertEquals(list.get(0).getText(),mathias.get("name"));
        Assert.assertEquals(list.get(1).getText(),mathias.get("email"));
        Assert.assertEquals(list.get(2).getText(),mathias.get("password"));
        Assert.assertEquals(list.get(3).getText(),mathias.get("confirmPassword"));
    }

}
