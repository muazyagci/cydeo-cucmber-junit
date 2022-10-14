package evraka;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class evrakaTask {

    @Test
    public void tsk1() {

        Driver.getDriver().get("https://www.amazon.com.tr");

        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("iPhone13 512" + Keys.ENTER);

        WebElement acptCookiesBtn = Driver.getDriver().findElement(By.id("sp-cc-accept"));

        acptCookiesBtn.click();

        WebElement evidenceOfTheList = Driver.getDriver().findElement(By.className("a-size-medium"));

        Assert.assertTrue(evidenceOfTheList.isDisplayed());

        WebElement firstOption = Driver.getDriver().findElement(By.xpath("//a[@class='a-link-normal s-no-outline']"));

        firstOption.click();

        WebElement name=Driver.getDriver().findElement(By.id("productTitle"));
        WebElement size = Driver.getDriver().findElement(By.xpath("(//span[@class='selection'])[1]"));
        WebElement colour = Driver.getDriver().findElement(By.xpath("(//span[@class='selection'])[2]"));
        WebElement price = Driver.getDriver().findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
        WebElement cents = Driver.getDriver().findElement(By.xpath("(//span[@class='a-price-fraction'])[1]"));
        WebElement change = Driver.getDriver().findElement(By.xpath("(//span[@class='a-price-symbol'])[1]"));
        WebElement stockStatus = Driver.getDriver().findElement(By.xpath("//span[@class='a-size-medium a-color-success']"));

        String name2=name.getText();

        String actualName = name2.substring(6, 15);

        if (actualName.equalsIgnoreCase("iPhone 13")){

            System.out.print(actualName);

        }else {
            System.err.println("Not matching");
            System.exit(1);
        }




        System.out.println("    .Size= " + size.getText());
        System.out.print(".Price= " + price.getText() + "," + cents.getText() + change.getText());


        System.out.println("   .StockStatus= " + stockStatus.getText());




        System.out.print(".Colour= " + colour.getText());

    }

}
