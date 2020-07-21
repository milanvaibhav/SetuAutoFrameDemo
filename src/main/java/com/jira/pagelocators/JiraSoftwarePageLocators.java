package com.jira.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JiraSoftwarePageLocators {
    @FindBy(xpath = "//button[@id='createGlobalItem']//span//span[contains(text(),'Create')]")
    public WebElement createBtn;

    @FindBy(xpath = "//div[@id='helpPanelContainer']//div//div//div//header//div//div//div//div//div//div//div//div//input")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@data-test-id='search-dialog-input']")
    public List<WebElement> searchList;
}
