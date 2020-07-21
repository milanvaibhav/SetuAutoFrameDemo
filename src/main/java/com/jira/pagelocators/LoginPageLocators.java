package com.jira.pagelocators;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

    @FindBy(xpath = "//h5[contains(text(),'Log in to your account')]")
    public  WebElement loginToYourAccText;

    @FindBy(xpath = "//input[@id='username']")
    public  WebElement username;

    @FindBy(xpath = "//body/div[@id='root']/div/div/div/div/div/div/section/div/form[@id='form-login']/div/button[@id='login-submit']/span/span[1]")
    public  WebElement continueBtn;

    @FindBy(xpath = "//input[@id='password']")
    public  WebElement password;

    @FindBy(xpath = "//div/button[@id='login-submit']/span/span[1]")
    public  WebElement loginBtn;

//    @FindBy(xpath = "//div/button[@id='login-submit']/span/span[1]")
//    public  WebElement loginBtn;

    @FindBy(xpath = "//span[contains(text(),'Create project')]")
    public  WebElement createProject;



}
