package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void openDriver(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			LoggerLoad.info("Testing on chrome");
			// WebDriverManager.chromedriver().browserVersion("118.0.5993.118").setup();
			//WebDriverManager.chromedriver().clearResolutionCache().setup();
			driver = new ChromeDriver(); // initialize chrome driver

		} else if (browser.equalsIgnoreCase("firefox")) {
			LoggerLoad.info("Testing on firefox");
			// WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			// initialize firefox driver

		} else if (browser.equalsIgnoreCase("edge")) {
			LoggerLoad.info("Testing on edge");
			// WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(); // initialize edge driver

		}

		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\sudha\\eclipse-workspace\\projectDsAlgo\\src\\test\\resources\\drivers\\msedgedriver.exe"
		// ); driver = new ChromeDriver();

		// Set Page load timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

	}

	/*
	 * public static String title() { return driver.getTitle(); }
	 */

	public static WebDriver getDriver() {
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
