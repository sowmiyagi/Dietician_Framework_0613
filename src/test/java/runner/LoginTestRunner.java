package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features =  "src/test/resources/FeatureFiles/" , 
		glue ="src/test/stepdefinitions"
		//plugin = { "pretty", "html:target/cucumber.html" }
		)

public class LoginTestRunner extends AbstractTestNGCucumberTests {

	}
