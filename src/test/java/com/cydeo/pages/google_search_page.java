package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class google_search_page {
    public google_search_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "L2AGLb")
    public WebElement AcceptBtn;

    @FindBy(name = "q")
    public WebElement searchBox;

}
