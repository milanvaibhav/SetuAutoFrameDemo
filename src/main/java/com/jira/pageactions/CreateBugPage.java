package com.jira.pageactions;

import com.jira.base.com.jira.BasePage;
import com.jira.pagelocators.CreateBugLocators;
import com.jira.utils.Helper;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class CreateBugPage extends BasePage {

    public static CreateBugLocators createBug;

    public CreateBugPage() {
        this.createBug = new CreateBugLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory, this.createBug);
    }

    public JiraSoftwarePage createBug(String issueSummary, String issuePriority){
        createBug.issueSummary.sendKeys(issueSummary);
        createBug.issuePriority.sendKeys(issuePriority);
        createBug.createIssueSubmit.click();
        return new JiraSoftwarePage();
    }

}
