package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = { "src/test/resources/FeatureFiles/" }, 
		glue = { "StepDefinitions", "Hooks" }, 
		plugin = { "pretty", "html:target/cucumber.html" })

public class LoginTestRunner extends AbstractTestNGCucumberTests {

	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = false) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */

}
