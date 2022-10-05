package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue= {"stepDef"},
        plugin = {"pretty", "html:target/Cicle_Staging-Test_Report.html"},
        tags = "@Regression"
)

public class runner_jUnit {
}