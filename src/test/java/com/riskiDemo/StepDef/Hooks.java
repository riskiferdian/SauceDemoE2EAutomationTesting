package com.riskiDemo.StepDef;

import com.riskiDemo.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

    @Before
    public void setUp(){
        setUpBrowser();

    }

    @After
    public void close(){
        closeBrowser();

    }
}
