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
			driver = new ChromeDriver(); // initialize chrome driver

		} else if (browser.equalsIgnoreCase("firefox")) {
			LoggerLoad.info("Testing on firefox");
			driver = new FirefoxDriver(); // initialize firefox driver

		} else if (browser.equalsIgnoreCase("edge")) {
			LoggerLoad.info("Testing on edge");
			driver = new EdgeDriver(); // initialize edge driver

		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

	}

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
