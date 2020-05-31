package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features/ui_test.feature", glue={"StepDefinitions"},
monochrome = true,
plugin = { "pretty", "html:target/Htmlreports"},
tags = "@Smoke_Test"
)
public class TestRunner {

	
	
}
