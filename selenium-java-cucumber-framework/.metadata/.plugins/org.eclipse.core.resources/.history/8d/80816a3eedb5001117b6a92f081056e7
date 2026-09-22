package pages;

import java.time.Duration;

import org.openqa.selenium.By;

import base.BaseTest;

public class HomePage extends BaseTest{
	By account = By.xpath("//span[@class='account']");
	public void click_on_account_button() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(account).click();
		
	}

}