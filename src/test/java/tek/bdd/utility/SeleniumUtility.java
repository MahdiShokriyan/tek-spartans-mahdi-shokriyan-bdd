package tek.bdd.utility;

import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.runtime.model.ExceptionThrown;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;

import java.time.Duration;
import java.util.List;

public class SeleniumUtility extends BaseSetup {
    private WebDriverWait wait;

    public WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }

    private WebElement waitForVisibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    //create a method to click on a given Locator
    public void clickOnElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    //writing on a located Field
    public void sendText(By locator, String text) {
        waitForVisibility(locator).clear();
        waitForVisibility(locator).sendKeys(text);
    }

    //create method for getting the text of a locator
    public String getElementText(By locator) {
        return waitForVisibility(locator).getText();
    }

    //validate the button is disable or enable
    public boolean isElementEnabled(By locator) {
        return waitForVisibility(locator).isEnabled();
    }


    //to check if element is visible or not
    public boolean elementIsVisible(By locator) {
        return waitForVisibility(locator).isDisplayed();
    }

    public byte[] takeScreenShot() {
        TakesScreenshot screenShot = (TakesScreenshot) getDriver();
        return screenShot.getScreenshotAs(OutputType.BYTES);
    }

    public List<WebElement> getElements(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("error")));

    }

}
