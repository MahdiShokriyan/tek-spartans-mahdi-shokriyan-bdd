package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.HomePage;
import tek.bdd.utility.SeleniumUtility;

public class ProductPageSteps extends SeleniumUtility {


    @When("user search for {string} and click on search")
    public void userSearchFor(String text) {
        sendText(HomePage.SEARCH_BAR, text);
        clickOnElement(HomePage.SEARCH_BUTTON);
    }

    @Then("Validate item is visible with {string} selector and contain {string}")
    public void validateItemIsVisible(String searchResultText, String expectedResult) {
        String actualResult = getElementText(By.xpath("//p[contains(text() , '" + searchResultText + "')]"));
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
