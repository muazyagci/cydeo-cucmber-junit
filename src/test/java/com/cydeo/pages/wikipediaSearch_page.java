package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wikipediaSearch_page {
    public wikipediaSearch_page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id ="searchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchBtn;

    @FindBy (id = "firstHeading")
    public WebElement mainHeader;
}
