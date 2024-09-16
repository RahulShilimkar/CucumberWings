package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/featureFile/HooksFeature.feature",
//		features="src/test/java/featureFile"  - This is to execute all files in Feature package.
		glue="stepDefinitions",
		dryRun=true,
		monochrome=true,
		plugin={"pretty",
				"html:target/cucumberReport.html",	
				"json:target/cucumber.json"}
//		tags="not @RegressionTest"
		//tags="@SmokeTest or @RegressionTest"
//		tags="@SmokeTest and @RegressionTest"
		)

public class CucumberRunner extends AbstractTestNGCucumberTests{

}
