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
		System.out.println("executing @before method in HOOKS");
		String browser = ConfigReader.getProperty("browser");
 		DriverFactory.initializeDriver(browser);
		DriverFactory.getDriver().get(ConfigReader.getProperty("url"));
		
	}
	@After
	public void tearDown() {
		System.out.println("executing @before method in HOOKS");
		DriverFactory.quitDriver();
		
	}

}
