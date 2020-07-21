package com.jira.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

    @FindBy(xpath = "//span[contains(text(),'Your products')]")
    public WebElement yourProductText;

    @FindBy(xpath = "//div[contains(text(),'Jira Software')]")
    public WebElement jiraSoftwareLink;


}
