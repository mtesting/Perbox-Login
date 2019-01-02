import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features"
        , glue = {"steps.LoginPage"}
        //,tags = {"@F-BrTxBets"}
        //,tags = {"@LoginTest"}
        //, monochrome = true
        //, plugin = {"pretty", "html:target/html/", "json:target/reports.json"}
)
public class TestRunner {

}
