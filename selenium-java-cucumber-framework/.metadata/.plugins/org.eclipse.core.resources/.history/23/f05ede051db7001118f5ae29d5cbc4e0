package hooks;

import org.openqa.selenium.WebDriver;

import base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilies.ConfigReader;

public class Hooks {
	static WebDriver driver;
	
	@Before
	public void setup() {
		String browser = ConfigReader.getProperty("browser");
 		DriverFactory.initializeDriver(browser);
		DriverFactory.getDriver().get(ConfigReader.getProperty("url"));
	}
	@After
	public void tearDown() {
		DriverFactory.quitDriver();
	}

}
