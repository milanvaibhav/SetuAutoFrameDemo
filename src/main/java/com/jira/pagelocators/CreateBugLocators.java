package com.jira.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateBugLocators {

    @FindBy(xpath = "//h2[contains(text(),'Create issue')]")
    public WebElement createIssueText;

    @FindBy(xpath = "//input[@id='project-field']")
    public WebElement projectField;

    @FindBy(xpath = "//input[@id='issuetype-field']")
    public WebElement issueTypeField;

    @FindBy(xpath = "//input[@id='summary']")
    public WebElement issueSummary;

    @FindBy(xpath = "//input[@id='priority-field']")
    public WebElement issuePriority;

    @FindBy(xpath = "//input[@id='create-issue-submit']")
    public WebElement createIssueSubmit;

    /*@FindBy(xpath = "")
    public WebElement createIssue;

    @FindBy(xpath = "")
    public WebElement createIssue;*/
}
