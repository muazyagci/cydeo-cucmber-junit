package com.cydeo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://web-table-2.cydeo.com/orders
public class WebTable2CydeoOrdersPage {
    // No page elements added

    public WebTable2CydeoOrdersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}