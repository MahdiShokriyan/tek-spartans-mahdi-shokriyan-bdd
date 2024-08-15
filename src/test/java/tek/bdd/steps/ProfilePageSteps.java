package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.ProfilePage;
import tek.bdd.utility.SeleniumUtility;

public class ProfilePageSteps extends SeleniumUtility {

    @Then("Validate user can see {string}")
    public void validateUserIsInAccountPage(String expectedResult) {
        String actualResult = getElementText(ProfilePage.PROFILE_TITLE);
        Assert.assertEquals("You are in profile page: ", expectedResult, actualResult);

    }
}
