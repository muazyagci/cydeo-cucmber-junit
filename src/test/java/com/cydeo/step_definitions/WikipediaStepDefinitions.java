package com.cydeo.step_definitions;
import com.cydeo.pages.wikipediaSearch_page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaStepDefinitions {
    wikipediaSearch_page wikipediaSearch_page=new wikipediaSearch_page();


    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
wikipediaSearch_page.searchBox.sendKeys(string);
    }
    @Then("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
wikipediaSearch_page.searchBtn.click();
    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }


    @When("User sees {string} in the main header")
    public void user_sees_in_the_main_header(String string) {
        Assert.assertTrue(wikipediaSearch_page.mainHeader.getText().contains(string));
    }
}
