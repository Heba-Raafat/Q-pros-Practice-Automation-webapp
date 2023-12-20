import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin ={"pretty",
                "html:target/Report.html",
                "json:target/Report.json",
        },
        features = "src/main/resources",
        glue={"src.test.java.StepDefinition.MyStepdefs"},
        monochrome = true

)

public class TestRunner extends AbstractTestNGCucumberTests{


}