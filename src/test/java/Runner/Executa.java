package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "Steps",
        tags = "@executa",
        plugin = {"pretty", "html:target/report.html"},
        dryRun = false,
        monochrome = true
)


public class Executa {

}