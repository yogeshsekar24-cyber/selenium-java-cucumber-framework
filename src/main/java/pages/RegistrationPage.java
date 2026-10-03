package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import base.BaseTest;

public class RegistrationPage extends BaseTest {
 By firstname = By.xpath("//input[@id='firstName']");
 By lastname = By.xpath("//input[@id='lastName']");
 By email = By.xpath("//input[@id='email']");
 By phone = By.xpath("//input[@id='primaryPhone']");
 By company = By.xpath("//input[@id='companyName']");
 By country = By.xpath("//app-dropdown[@key='countryCode']");
 By password = By.xpath("//input[@id='password']");
 By confirmpassword = By.xpath("//input[@id='confirmPassword']");
 By purchaseoption = By.xpath("//span[@class='slider']");
 By termsandcondition = By.xpath("//div[@class='check-box-cntnr']");
 By submit = By.xpath("//button[@type='submit']");
 
 public void enter_the_first_name(String name) {
	 wait.waitForVisibility(firstname).sendKeys(name);
 }
 public void enter_the_last_name(String lname) {
	 driver.findElement(lastname).sendKeys(lname);
 }
 public void enter_the_emailID(String emailID) {
	 driver.findElement(email).sendKeys(emailID);
 }
 public void enter_phone_number(String phonenumber) {
	 driver.findElement(phone).sendKeys(phonenumber);
 }
 public void enter_company_name(String compname) {
	 driver.findElement(company).sendKeys(compname);
 }
 public void select_the_country(String countryname) {
	 driver.findElement(country).click();
	 wait.waitForVisibility(By.xpath("//p[normalize-space()='"+countryname+"']")).click();
 }
 public void enter_the_password(String pwd) {
	 driver.findElement(password).sendKeys(pwd);
 }
 public void enter_confirm_password(String confirmpwd) {
	 driver.findElement(confirmpassword).sendKeys(confirmpwd);
 }
 public void purchase_option(boolean key) {
	 
	 boolean value = driver.findElement(purchaseoption).isEnabled();
	 if (key != value) {
		 driver.findElement(purchaseoption).click();
	 }
 }
 public void terms_and_condition() throws InterruptedException {
	 boolean value = driver.findElement(termsandcondition).isSelected();
	 System.out.println(value);
	 Thread.sleep(5000);
	 if(value!=true) {
		 driver.findElement(termsandcondition).click();
	 }
 }
 public void click_on_submit() throws InterruptedException {
	 Thread.sleep(5000);
	 driver.findElement(submit).click();
 }
 public void MFA_authentication(String email) throws InterruptedException {
	 String appwindow = driver.getWindowHandle();
	 driver.switchTo().newWindow(WindowType.TAB);
	 driver.get("https://www.mailinator.com/");
	 wait.waitForVisibility((By.xpath("//input[@id='search']"))).sendKeys(email);
	 driver.findElement(By.xpath("//button[normalize-space()='GO']")).click();
	 wait.waitForVisibility(By.xpath("//td[normalize-space()='Agilent One-time verification code']")).click();
	 wait.waitForVisibility(By.xpath("//iframe[@id='html_msg_body']"));
	 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='html_msg_body']")));
	 String otp = wait.waitForVisibility(By.xpath("//span[@id='verification-code']")).getText();
	 driver.switchTo().defaultContent();
	 driver.switchTo().window(appwindow);
	 for(int i=0;i<otp.length();i++) {
		 String digit = String.valueOf(otp.charAt(i));
		 wait.waitForVisibility(By.xpath("//input[contains(@aria-label,'One Time Password Input Number "+(i+1)+"')]")).sendKeys(digit);
	 }
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(Duration.ofSeconds(5));
 }
}
