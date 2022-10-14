package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.OrderPage;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.pages.webTable_page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.LinkedList;
import java.util.List;

public class Order_StepDefinitions {
BasePage basePage=new BasePage();
        webTable_page webTable_page=new webTable_page();
        OrderPage orderPage=new OrderPage();
        ViewAllOrdersPage viewAllOrdersPage=new ViewAllOrdersPage();
    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {

        //Getting the page url using configuration.properties
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableUrl"));

        //Calling our login method to log in to web table app
        webTable_page.login();

        //clicking to 'order' link to go order page
        basePage.order.click();

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {

        Select select=new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);
    }
    @And("user enters quantity {int}")
    public void userEntersQuantity(int quantity) {
        //accepting in argument and sending it using sendKeys() method
    //orderPage.inputQuantity.sendKeys(quantity +"");
    //since sendKeys() method only accepts String, we need to either concat or sendString.valueOf(int);

        //this method will delete what ever is in the input box
       // orderPage.inputQuantity.clear();

        orderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);
    orderPage.inputQuantity.sendKeys(String.valueOf(quantity));

    String str=quantity+"";

    }
  
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        orderPage.inputName.sendKeys(string);
    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
        orderPage.inputStreet.sendKeys(string);
    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderPage.inputCity.sendKeys(string);
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        orderPage.inputState.sendKeys(string);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        orderPage.inputZip.sendKeys(string);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCardType) {
        // this line will loop through the list and decide which radio button to click
        BrowserUtils.clickRadioButton(orderPage.cardType,expectedCardType );
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
orderPage.cardNoInput.sendKeys(string);

    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        orderPage.cardExpInput.sendKeys(string);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        orderPage.processOrderButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {

        Assert.assertEquals(viewAllOrdersPage.newCustomerCell.getText(),string);

    }
}
