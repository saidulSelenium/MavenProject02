package com.Saidul.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"Features"},glue= {"com.Saidul.stepdefs"}
)

public class TestRunner1 extends AbstractTestNGCucumberTests {

}
