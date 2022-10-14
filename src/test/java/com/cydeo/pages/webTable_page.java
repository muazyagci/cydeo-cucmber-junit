package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webTable_page {

    public webTable_page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (name = "username")
    public WebElement usernameInputBox;
    @FindBy(name = "password")
    public WebElement passwordInputBox;
    @FindBy (xpath = "//button[.='Login']")
    public WebElement loginBtn;

    /**
     * no parameter
     * when we call this method, it will directly login using
     *
     * Username:Test
     * Password: Terter
     */
    public void login(){
        this.usernameInputBox.sendKeys("Test");
        this.passwordInputBox.sendKeys("Tester");
        this.loginBtn.click();
    }

    /**
     * This method will accept two arguments and login
     * @param username
     * @param password
     */
    public void login(String username,String password){
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginBtn.click();
    }

    /**
     * This method will log in using two arguments and login
     * configuration.properties
     */
    public void loginWithConfig(){
        usernameInputBox.sendKeys(ConfigurationReader.getProperty("WebTableUsername"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("WebTablePassword"));
        loginBtn.click();

    }
}
