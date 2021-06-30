package interviewMegi;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:reports/test-report" }, tags = "@smokeTest", features = "Features")
public class RunTestHackerankBabylon {

}
