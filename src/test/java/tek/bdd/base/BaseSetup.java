package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {
    //
    private static WebDriver driver;

    //Getter for WebDriver
    public static WebDriver getDriver() {
        return driver;
    }

    public void setupBrowser() {
     /*   WebDriver instance
          Navigation to retail App
          maximize
          and implicitly wait
      */
        driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    //Quit the Browser if the value is not Null
    public void quitBrowser() {
        if (driver != null) driver.quit();
    }
}