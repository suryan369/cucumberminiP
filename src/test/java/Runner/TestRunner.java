package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions

(features=".//Features/Loginpage.feature",
 glue="stepdefinitions",
 dryRun=false,

 plugin= {"pretty","html:target/cucumber-reports","json:target/cucumber.json"},
 publish=true
)
public class TestRunner {

}
