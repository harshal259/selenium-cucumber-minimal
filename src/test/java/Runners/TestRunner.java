package Runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDefinitions",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty"
        }
)
public class TestRunner {

}
