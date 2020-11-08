package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 

	@CucumberOptions(
	        features = "src/test/resources/feature",
	        glue= {"specDefinitions"},
	        plugin = { "html:target/Report-html"},
	        monochrome = true
	        )

	public class TestRunner {
}
