package com.riskiDemo.PageObject;
import com.riskiDemo.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LandingPage extends BaseClass {
    private static String showLandingPage = "//span[@class='title']";
    private static String sortIcon = "//select[@class='product_sort_container']";
    private static String redShirt = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']";



    public static boolean verifyLandingPage(){
        WebElement element = driver.findElement(By.xpath(showLandingPage));
        element.isDisplayed();
        return true;
    }

    public static void sortProduct(String sort){
        WebElement selectContainer = driver.findElement(By.xpath(sortIcon));
        Select a = new Select(selectContainer);
        a.selectByVisibleText(sort);
    }

    public static void selectProduct(){
        driver.findElement(By.xpath(redShirt)).click();
    }

}
