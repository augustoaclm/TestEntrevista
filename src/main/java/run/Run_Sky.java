package run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/main/resources", 
glue = {"steps", "hooks"},
plugin = {"pretty", "json:target/cucumber-reports/teste.json"},
monochrome = true)

public class Run_Sky {

}
