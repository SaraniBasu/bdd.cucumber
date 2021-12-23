package bdd.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features = "@target/failed_scenarios.txt",
		glue = {"steps",
				},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty",
				}
		)
public class RerunRunner {

}
