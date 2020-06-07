package com.o2.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
        (

                features = "src/test/resources/features.RegressionTest",
                glue = "com.o2",
                plugin = {"pretty","html:target/cucumber-report/RunReport"},
                tags = {"@Regression"}
        )
public class TestRunner extends AbstractTestNGCucumberTests {
}