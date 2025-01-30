package com.riskiDemo.PageObject;

import com.riskiDemo.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {
    private static String txtUserName = "user-name";
    private static String txtPassword = "password";
    private static String btnLogin = "//input[@id='login-button']";
    private static String landingPage = "//h4[.='Accepted usernames are:']";
    private static String errorMessage = "//h3[.='Epic sadface: Username and password do not match any user in this service']";

    public static void enterUserName (String username){
        driver.findElement(By.id(txtUserName)).sendKeys(username);
    }

    public static void enterPassword (String password){
        driver.findElement(By.id(txtPassword)).sendKeys(password);
    }

    public static void clickLoginButton(){
        driver.findElement(By.xpath(btnLogin)).click();
    }

    public static String verifyLoginPage(){
       WebElement loginPage = driver.findElement(By.xpath(landingPage));
       String text = loginPage.getText();
       return text;
    }

    public static String verifyErrorMessage(){
        WebElement verErrorMessage = driver.findElement(By.xpath(errorMessage));
        String text = verErrorMessage.getText();
        return text;
    }

}
