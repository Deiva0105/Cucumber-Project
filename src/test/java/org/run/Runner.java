package org.run;

import org.helping.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Guhan\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Features", glue = "org.step", dryRun = false,  
plugin = {"pretty", "json:C:\\Users\\Guhan\\eclipse-workspace\\Cucumber\\Reports\\JSON Report\\fb.json"})
public class Runner {

	
	@AfterClass
	public static void report() {
		JvmReport.generateJvmReport("C:\\Users\\Guhan\\eclipse-workspace\\Cucumber\\Reports\\JSON Report\\fb.json");

	}
	
	
}
