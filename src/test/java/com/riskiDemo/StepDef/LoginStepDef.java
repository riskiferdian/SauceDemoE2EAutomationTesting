package com.riskiDemo.StepDef;

import com.riskiDemo.BaseClass;
import com.riskiDemo.PageObject.LandingPage;
import com.riskiDemo.PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;

public class LoginStepDef extends BaseClass {


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
}
