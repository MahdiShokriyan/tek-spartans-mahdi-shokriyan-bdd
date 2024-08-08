package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {
    //WebDriver to how access in every method
    private static WebDriver driver;
    private Properties properties;

    //Find the full path to file
    //FileInputStream to read the file
    //Properties and load the FileInputStream to the properties
    public BaseSetup(){

       try {
           String configFilePath = System.getProperty("user.dir") +
                   "/src/test/resources/configs/dev-config.properties";
           File file = new File(configFilePath);
           FileInputStream fileInputStream = new FileInputStream(file);
           properties = new Properties();
           properties.load(fileInputStream);
       }catch (IOException e){
           throw new RuntimeException("Something wrong with config file ", e);
       }
    }

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
        String url = properties.getProperty("ui.url");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    //Quit the Browser if the value is not Null
    public void quitBrowser() {
        if (driver != null) driver.quit();
    }
}