package com.jira.rough;

import com.jira.base.com.jira.BasePage;
import com.jira.pageactions.CreateBugPage;
import com.jira.pageactions.HomePageActions;
import com.jira.pageactions.JiraSoftwarePage;
import com.jira.pageactions.LoginPageActions;
import com.jira.utils.Helper;
import org.testng.Assert;
import org.testng.Reporter;

public class Test {

    public static void main(String[] args) {
        String issueSummary ="This is another BUG Created By Milan";
        String issuePriority ="High";
        BasePage.setUp();
        LoginPageActions login = new LoginPageActions();
        HomePageActions homePage = login.loginToJira();
        Helper.implicitWait();
        homePage.validateHomeText();
        Reporter.log("Login Successfull. Clicking on JIRA Software");
        JiraSoftwarePage jiraPage= homePage.goToJiraSoftware();
        Helper.implicitWait();
        CreateBugPage bug = jiraPage.goToCreate();
        bug.createBug(issueSummary,issuePriority);
        Reporter.log("Bug Created Successfully");
        BasePage.quit();
    }
}
