package com.jira.utils;

import com.jira.base.com.jira.BasePage;
import com.jira.base.com.jira.Constants;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Helper extends BasePage {
    /**
     *
     * @return: Current Page Title
     */
    public static String getTitle(){
        return driver.getTitle();
    }

    /**
     * Implicit Wait Implementation
     */
    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(Constants.implicitWait, TimeUnit.SECONDS);
    }

    /**
     *
     * @param wb DropDown WebElement
     * @param text Text to be searched
     */
    public static void selectByValue(WebElement wb, String text){
        Select select = new Select(wb);
        select.selectByVisibleText(text);
    }

    /**
     *
     * @param wb Expected WebElement in page
     */
    public static void explicitWait(WebElement wb){
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(wb));
    }

    /**
     *
     * @param destFilePath Destination File Path
     */
    public static void screenShot(String destFilePath){
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile=new File(destFilePath);
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*public static boolean VerifyTextInSearchBox(String string, List<WebElement> list){
        boolean status = false;
        for(int i = 0 ;i< list.size();i++)
        {
            System.out.println(list.get(i).getText());

            if(list.get(i).getText().equals(string))
            {
                list.get(i).click();
                status = true;
                break;
            }
        }

        return status;

    }*/

    @DataProvider(name = "createbug")
    public Object[][] getData(){
        // This data will come from excel sheet using ExcelReader.getExcelData()
        return new Object[][]{{"Creating BUG 1","High"},{"Creating Bug 2","Medium"}};
    }
}
