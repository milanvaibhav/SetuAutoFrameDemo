package com.jira.tests.issues;

import com.jira.base.com.jira.BasePage;
import com.jira.pageactions.CreateBugPage;
import com.jira.pageactions.HomePageActions;
import com.jira.pageactions.JiraSoftwarePage;
import com.jira.pageactions.LoginPageActions;
import com.jira.utils.Helper;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCreateBug {

    @Test(dataProviderClass = Helper.class,dataProvider = "createBug")
    public void createBug(String issueSummary, String issuePriority){
        BasePage.setUp();
        LoginPageActions login = new LoginPageActions();
        HomePageActions homePage = login.loginToJira();
        Helper.implicitWait();
        homePage.validateHomeText();
        Reporter.log("Login Successful.Clicking on Jira Software Link");
        JiraSoftwarePage jiraPage= homePage.goToJiraSoftware();
        Helper.implicitWait();
        CreateBugPage bug = jiraPage.goToCreate();
        bug.createBug(issueSummary,issuePriority);
        Reporter.log("Bug Created Successfully");
        BasePage.quit();
    }
}
