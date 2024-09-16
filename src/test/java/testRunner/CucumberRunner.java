package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/featureFile",
		glue="stepDefinitions",
		monochrome=true,
//		tags="not @RegressionTest"
		tags="@SmokeTest or @RegressionTest"
//		tags="@SmokeTest and @RegressionTest"
		)

public class CucumberRunner extends AbstractTestNGCucumberTests{

}
