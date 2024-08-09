package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import tek.bdd.pages.ProfilePage;
import tek.bdd.utility.SeleniumUtility;

public class ProfilePageSteps extends SeleniumUtility {

    @Then("Validate user is in Account Page")
    public void validateUserIsInAccountPage() {
        String actualResult = getElementText(ProfilePage.PROFILE_TITLE);
    }
    @When("user update {string} and {string}")
    public void userUpdateAnd(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
