package com.jira.pageactions;

import com.jira.base.com.jira.BasePage;
import com.jira.base.com.jira.Constants;
import com.jira.pagelocators.JiraSoftwarePageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class JiraSoftwarePage extends BasePage {

    public static JiraSoftwarePageLocators jiraSoftware;

    public JiraSoftwarePage() {
        this.jiraSoftware = new JiraSoftwarePageLocators();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, (int) Constants.implicitWait), this.jiraSoftware);
    }

    public CreateBugPage goToCreate(){
        jiraSoftware.createBtn.click();
        return new CreateBugPage();
    }

    public void searchAnIssue(String searchText){
        jiraSoftware.searchBox.sendKeys(searchText);
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@data-test-id='search-dialog-input']")));
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='sc-hgHYgh yPFwQ']"));
        System.out.println(list.size());
        for(int i = 0 ;i< list.size();i++){
            System.out.println(list.get(i).getText());
            if(list.get(i).getText().equals(searchText)){
                list.get(i).click();
                System.out.println("Bug Created Successfully");
                break;
            }
        }

    }
}
