package base;

import org.openqa.selenium.WebDriver;

import utilies.WaitUtils;

public class BaseTest {
	protected WebDriver driver;
	protected WaitUtils wait;
	
	public  BaseTest() {
driver = DriverFactory.getDriver();
wait = new WaitUtils(driver);
	}	
}
