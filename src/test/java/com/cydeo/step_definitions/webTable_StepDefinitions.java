package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import com.cydeo.pages.webTable_page;

import java.util.Map;

public class webTable_StepDefinitions {

webTable_page webTable_page=new webTable_page();
    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url= ConfigurationReader.getProperty("webTableUrl");

        Driver.getDriver().get(url);

    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
webTable_page.usernameInputBox.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
webTable_page.passwordInputBox.sendKeys(string);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
webTable_page.loginBtn.click();
    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyTitleContains("orders");

    }
    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
       webTable_page.login(username,password);


    }

    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials ) {
     webTable_page.login(credentials.get("username"),credentials.get("password"));
    }



}
