package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"./src/test/java/features/"},
		glue = {"stepDefinitions","hook"},
		dryRun = false,
		monochrome = true
		)

public class Cucumber_Runner extends AbstractTestNGCucumberTests {
	
			
		
	}


