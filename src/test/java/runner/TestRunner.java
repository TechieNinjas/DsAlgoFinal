package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Utilities.ConfigReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(
		plugin = {"pretty", "html:target/DsAlgoFinal.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = false, // console output color
		tags = "@DsAlgoFinal", // tags from feature file
		dryRun = !true, //To add new method give true
		features = { "src/test/resources/features" }, // location of feature files
		glue = {"stepDefinition","ApplicationHooks","Utilities"}) // location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	@BeforeTest
	@Parameters({"browser"})
	public void defineBrowser(String browser)throws Throwable {
		ConfigReader.setBrowserType(browser);
	}
	

}
