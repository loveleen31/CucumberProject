package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\lovel\\CucumberProject1\\src\\test\\java\\FeatureProject\\Store.feature",glue= {"StepDefinationProject"},
plugin= {"pretty","html:target/HTMLreports.html"},monochrome=true,
dryRun=true)

public class TestRunnerClass {

}
