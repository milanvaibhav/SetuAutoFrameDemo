package com.jira.base.com.jira;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

public class BasePage {

    /**
     * Intialize all classes
     */


    public static WebDriver driver;
    public static String browser;


    //@BeforeSuite
    public static void setUp(){
        if(Constants.BROWSER.equalsIgnoreCase("Chrome")){
            Reporter.log("Chrome Browser Selected");
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + File.separator + "src/test/resources/executables/chromedriver");
            driver = new ChromeDriver();
        }else if(Constants.BROWSER.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + File.separator + "src/test/resources/executables/chromedriver");
            driver = new FirefoxDriver();
        }else {
            System.out.println("Browser Type Not Supported");
            System.exit(0);
        }

        driver.get(Constants.url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.implicitWait, TimeUnit.SECONDS);
        Reporter.log("Setup Completed");


    }

    //@AfterSuite
    public static void quit(){
        Reporter.log("Quit Method Called");
        driver.quit();
    }

}
