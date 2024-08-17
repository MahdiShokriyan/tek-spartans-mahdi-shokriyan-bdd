package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.HomePage;
import tek.bdd.utility.SeleniumUtility;

import java.util.List;

public class ProductPageSteps extends SeleniumUtility {


    @When("user search for {string} and click on search")
    public void userSearchFor(String text) {
        sendText(HomePage.SEARCH_BAR, text);
        getDriver().findElement(HomePage.SEARCH_BAR).sendKeys(Keys.ENTER);


        //clickOnElement(HomePage.SEARCH_BUTTON);
    }

    @Then("Validate item is visible with selector and contain {string}")
    public void validateItemIsVisible(String expectedResult) {

       List<WebElement> elements = getElements(By.xpath
               ("//div[@class ='products']/div//p[@class='products__name']"));
       for (WebElement element : elements){
           Assert.assertTrue(element.getText().toLowerCase().contains(expectedResult.toLowerCase()));
       }

    }

}
