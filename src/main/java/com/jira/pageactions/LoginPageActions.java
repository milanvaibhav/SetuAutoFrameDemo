package com.jira.pageactions;

import com.jira.base.com.jira.BasePage;
import com.jira.pagelocators.LoginPageLocators;
import com.jira.utils.Helper;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPageActions extends BasePage {

    public LoginPageLocators login;

    public LoginPageActions() {
        this.login = new LoginPageLocators();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),this.login);
    }

    public HomePageActions loginToJira(){
        Assert.assertEquals(Helper.getTitle(),"Log in to continue - Log in with Atlassian account");
        Reporter.log("Login Page Displayed");
        login.username.sendKeys("vaibhav.milan44@gmail.com");
        login.continueBtn.click();
        Helper.implicitWait();
        login.password.sendKeys("Ranchi@123");
        login.loginBtn.click();
        return new HomePageActions();

    }

}
