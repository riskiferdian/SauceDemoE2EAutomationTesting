package com.riskiDemo.StepDef;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.riskiDemo.BaseClass;
import com.riskiDemo.PageObject.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LandingPageStepDef extends BaseClass {
    @When("^user sort produk by (.*)$")
    public void userSortProdukByNameZToA(String sort) throws InterruptedException {
        LandingPage.sortProduct(sort);
        Thread.sleep(2000);

    }

    @And("select sauce labs backpack")
    public void selectSauceLabsBackpack() throws InterruptedException {
        LandingPage.selectProduct();
        Thread.sleep(2000);
    }
}
