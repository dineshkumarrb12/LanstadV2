package com.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"com.step.definitions"},
		tags = "@testcase11",
		plugin = {"pretty", "html:target/reports"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
