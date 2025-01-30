package com.riskiDemo.StepDef;

import com.riskiDemo.BaseClass;
import com.riskiDemo.PageObject.LandingPage;
import com.riskiDemo.PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;

public class LoginStepDef extends BaseClass {


    //normal login
    @Given("user already open login page sauce demo website")
    public void userAlreadyOpenLoginPageSauceDemoWebsite() {
        LoginPage.verifyLoginPage();
        Assert.assertEquals("Accepted usernames are:" , LoginPage.verifyLoginPage());
    }

    @When("^user input username (.*)$")
    public void userInputUsername(String username) {
        LoginPage.enterUserName(username);
    }

    @And("^user input password (.*)$")
    public void userInputPassword(String password) {
        LoginPage.enterPassword(password);

    }

    @And("click login button")
    public void clickLoginButton() throws InterruptedException {
        LoginPage.clickLoginButton();
        Thread.sleep(2000);
    }

    @Then("user logged in successfully")
        public void userLoggedInSuccessfully () throws InterruptedException {
        LandingPage.verifyLandingPage();
        Assert.assertTrue(LandingPage.verifyLandingPage());
        Thread.sleep(2000);
    }

    // user already logged in
    @Given("^user already logged in with username (.*) password (.*) and click login button$")
    public void userAlreadyLoggedIn(String username, String password) throws InterruptedException {
        LoginPage.enterUserName(username);
        LoginPage.enterPassword(password);
        LoginPage.clickLoginButton();
        Thread.sleep(1500);
    }

    //invalid login
    @When("^user input invalid username (.*)$")
    public void userInputInvalidUsername(String username) {
        LoginPage.enterUserName(username);
    }

    @And("^user input invalid password (.*)$")
    public void userInputInvalidPassword(String password) {
        LoginPage.enterPassword(password);
    }

    @Then("system will show pop up error message")
    public void systemWillShowPopUpErrorMessage() {
        LoginPage.verifyErrorMessage();
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service" , LoginPage.verifyErrorMessage());

    }
}
