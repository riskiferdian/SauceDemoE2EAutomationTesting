package com.riskiDemo.PageObject;

import com.riskiDemo.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {
    private static String txtUserName = "user-name";
    private static String txtPassword = "password";
    private static String btnLogin = "//input[@id='login-button']";

    public static void enterUserName (String username){
        driver.findElement(By.id(txtUserName)).sendKeys(username);
    }

    public static void enterPassword (String password){
        driver.findElement(By.id(txtPassword)).sendKeys(password);
    }

    public static void clickLoginButton(){
        driver.findElement(By.xpath(btnLogin)).click();
    }

//    public static String verifyLandingPage(){
//        WebElement element = driver.findElement(By.xpath(showLandingPage));
//        String text = element.getText();
//        return text;
//    }
}
