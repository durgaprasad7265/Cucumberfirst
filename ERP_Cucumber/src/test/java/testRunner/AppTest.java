package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"},monochrome = true,glue = {"stepDefination"},
tags=("@Supplier, @Customer"),
plugin = {"pretty","html:target/report/cucumber",
		"junit:target/report/cucumber.xml",
		"json:target.report/cucumber.json"})

public class AppTest extends AbstractTestNGCucumberTests {

}
