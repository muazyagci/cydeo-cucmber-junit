package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
Hook class will allow us to pass pre and post conditions for each scenario and each step
 */
public class Hooks {

    @Before (order = 1)//Before method coming from cucumber-java.Not from junit
    public void setupScenario(){
        System.out.println("===Setting up browser using cucumber @Before");
    }

    @Before(value = "@login",order = 2)//Before method coming from cucumber-java.Not from junit
    public void setupScenarioForLogins(){
        System.out.println("===This will only apply to Scenarios with @login ");
    }

    @Before(value = "@db",order = 0)//Before method coming from cucumber-java.Not from junit
    public void setupScenarioForDataBase(){
        System.out.println("===This will only apply to Scenarios with @db ");

    }


    @After
    public void tearDownScenario(Scenario scenario)  {
       /* System.out.println("====Closing browser using cucumber @After");
        System.out.println("====Scenario ended/ Take screenshot if failed!");
        */

if (scenario.isFailed()) {
    byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
    scenario.attach(screenshot, "image/png", scenario.getName());
}

        Driver.closeDriver();
       System.out.println("Driver closed");
    }



        @BeforeStep
    public void setupStep(){
        System.out.println("------>applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("------>applying tearDown using @AfterStep");
    }

}
