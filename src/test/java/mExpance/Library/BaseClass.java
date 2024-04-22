package mExpance.Library;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.*;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseClass {

    public static WebDriver driver;
    private Properties properties;
    private String pass1;
    private String pass2;

    public BaseClass() {
        try {
            properties = new Properties();
            String filePath = System.getProperty("user.dir") + "/src/test/java/mExpanse/Resources/properties";
            FileInputStream inputStream = null;

            inputStream = new FileInputStream(filePath);
            properties.load(inputStream);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(properties.getProperty("baseUrl"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }


    public void tearDown() {

        driver.quit();
    }

    public static void takeScreenshot(String testMethodName) {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String currentDir = System.getProperty("user.dir") + "/build/screenshots/";
            FileUtils.copyFile(scrFile, new File(currentDir + testMethodName + ".jpg"));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
