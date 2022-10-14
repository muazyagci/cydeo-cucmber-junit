package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.cydeo.pages.DropDowns_page;

import java.util.ArrayList;
import java.util.List;

public class dataTables_StepDefinitions {
    DropDowns_page dropDowns_page=new DropDowns_page();
    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String>fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(1));

    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

        List<String> actualMonths = BrowserUtils.dropdownOptionsAsString(dropDowns_page.monthDropdown);

        Assert.assertEquals(expectedMonths,actualMonths);

    }

}
