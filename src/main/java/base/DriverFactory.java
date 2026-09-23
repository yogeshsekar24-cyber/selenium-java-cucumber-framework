package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;

public class DriverFactory {
	private static ThreadLocal<WebDriver> driver =
            new ThreadLocal<>();
	
	public static void initializeDriver(String browser) {
		
	    WebDriver webDriver = null;
	    System.out.println("Executing driver initialization");
		
		if(browser.equals("Chrome")) {
			webDriver = new ChromeDriver();
		}
		else if(browser.equals("Firefox")){
			webDriver = new FirefoxDriver();
		}
		else if(browser.equals("Edge")) {
			webDriver = new EdgeDriver();
		}
		else {
			System.out.println("Enter the valid browser");
		}
		webDriver.manage().window().setSize(new Dimension(1920, 1080));
		driver.set(webDriver);
	}
	public static WebDriver getDriver() {
		System.out.println("returing driver");
		return driver.get();
		
	}
	public static void quitDriver() {

        if (driver != null) {
            driver.get().quit();
            driver.remove();
        }
}
}
