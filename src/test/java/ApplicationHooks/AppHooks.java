package ApplicationHooks;

import Utilities.BaseClass;
import Utilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks extends BaseClass {

	@Before
	public static void beforeScenario() throws Throwable{//(Scenario scenario) { // browserSetup()
//		Get browser Type from config file
//		LoggerLoad.info("Loading Config file");
//		ConfigReader.loadConfig();
//		String browser = ConfigReader.getBrowserType();
//		Initialize driver from BaseClass 
//		LoggerLoad.info("Initializing driver for:"+browser);	
		
		BaseClass.openDriver(ConfigReader.getBrowserType());
		
	}

	@After
	public void afterScenario(Scenario scenario) { // teardown()
		// checking to see if scenario has failed

		/*
		 * if (scenario.isFailed()) { final byte[] screenshot = ((TakesScreenshot)
		 * BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
		 * 
		 * scenario.attach(screenshot, "image/png", scenario.getName()); }
		 */
		BaseClass.closeDriver();
	}

}

/*
 * @Before("@DataStructure1") public void getUrlForDataStr() {
 * 
 * driver.get(homePageUrl);
 * 
 * }
 * 
 * @Before("@DataStructure2") public void getUrlForNDataStr() {
 * 
 * driver.get(homePageUrl);
 * 
 * }
 */
