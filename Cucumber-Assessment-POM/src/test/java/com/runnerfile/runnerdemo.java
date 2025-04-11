package com.runnerfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
	    features = {"src\\test\\resources\\Feature\\Register.feature",
	    		"src\\test\\resources\\Feature\\Login.feature"},
	    glue = "com.definition",
	    plugin = {
	        "pretty",
	        "html:target/cucumber-reports/html-report.html",
	        "json:target/cucumber-reports/cucumber.json", 
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	    }
	)
public class runnerdemo extends AbstractTestNGCucumberTests{

}
