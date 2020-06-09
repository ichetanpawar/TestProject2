package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature",   //package name to run all feature files or provide specific feature file
		glue="stepDefinations"                //package name
		)
public class TestRunner {

}
