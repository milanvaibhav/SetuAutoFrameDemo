package com.jira.pageactions;

import com.jira.base.com.jira.BasePage;
import com.jira.pagelocators.HomePageLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class HomePageActions extends BasePage {

    public static HomePageLocators home;

    public HomePageActions() {
        this.home = new HomePageLocators();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this.home);
    }

    public void validateHomeText(){
        Assert.assertEquals(home.yourProductText.getText(),"Your products");
    }
    public JiraSoftwarePage goToJiraSoftware(){
        home.jiraSoftwareLink.click();
        return new JiraSoftwarePage();
    }
}
