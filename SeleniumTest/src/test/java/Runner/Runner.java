package Runner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Feature", glue = {"Steps"}, 
plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target\\cucumber-reports/report.html"},
monochrome = true)
public class Runner {
	   @AfterClass
	    public static void writeExtentReport() {
	    Reporter.loadXMLConfig(new File("config\\report.xml"));
	   }
}