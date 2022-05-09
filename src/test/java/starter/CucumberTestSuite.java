package starter;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "classpath:features"
)
public class CucumberTestSuite {
    System.out.println("hello");
    System.out.println("Line 1 added");
    System.out.println("hello");


}
