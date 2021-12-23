package bdd.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features = "src//test//resources//Features//",
		glue = {"steps"},
		dryRun=false,
		monochrome=true,	
//				tags="@RegressionTest and @SmokeTest"
//				tags="not @RegressionTest and not @SmokeTest"
//		tags="@RegressionTest"
//		tags="@PhaseOne and @Regression or @SmokeTest"
//		tags="@RegressionTest and not @PhaseOne"
//		tags="@PhaseOne and @RegressionTest or @PhaseTwo and @SmokeTest"
		tags="@PhaseTwo"
		)
public class TaggedRunner {

}
