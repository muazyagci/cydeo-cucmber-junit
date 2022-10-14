package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDowns_page {
    public DropDowns_page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "month")
    public WebElement monthDropdown;


}
