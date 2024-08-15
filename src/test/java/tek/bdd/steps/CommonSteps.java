package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.ProfilePage;
import tek.bdd.utility.SeleniumUtility;

public class CommonSteps extends SeleniumUtility {

    @Given("user click on {string} link")
    public void userClickOnLinks(String linkText) {
        clickOnElement(By.linkText(linkText));
    }


    @When("user click on {string} button")
    public void user_click_on_button(String buttonVisibleText) {

        String buttonXpath = "//button[text()='" + buttonVisibleText + "']";

        clickOnElement(By.xpath(buttonXpath));

    }

    @When("user write on {string} {string}")
    public void UserSendValueToInputField(String value, String text) {
        String buttonXpath = "//label[text()= '" + value + "']/..//input";
        sendText(By.xpath(buttonXpath), text);
    }

    @Then("Validate Toast Displayed")
    public void isToastDisplayed() {
        boolean isToastDisplayed = elementIsVisible(ProfilePage.TOAST_BOX);
        Assert.assertTrue("Toast should Displayed ", isToastDisplayed);
    }
}
