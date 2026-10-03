package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.RegistrationPage;

public class RegisterationSteps {
	LoginPage login = new LoginPage();
	RegistrationPage register = new RegistrationPage();
	
	@When("user click on create account button and lands on to user registration page")
	public void user_click_on_create_account_button_and_lands_on_to_user_registration_page() {
	    login.click_on_create_account();
	}
	@And("enters the first name {string}")
	public void enters_the_first_name(String name) {
	    register.enter_the_first_name(name);
	}
	@And("enters the last name {string}")
	public void enters_the_last_name(String string) {
	register.enter_the_last_name(string);
	
	}
	@And("enters the business email {string}")
	public void enters_the_business_email(String string) {
	   register.enter_the_emailID(string);
	}
	@And("enters the phone number {string}")
	public void enters_the_phone_number(String string) {
	    register.enter_phone_number(string);
	}
	@And("enters the company name {string}")
	public void enters_the_company_name(String string) {
	    register.enter_company_name(string);
	}
	@And("selects the country {string}")
	public void selects_the_country(String string) {
	   register.select_the_country(string);
	}
	@And("enters the password {string}")
	public void enters_the_password(String string) {
	    register.enter_the_password(string);
	}
	@And("confirms the password {string}")
	public void confirms_the_password(String string) {
	    register.enter_confirm_password(string);
	}
	@And("disabling the purchase option {string}")
	public void disabling_the_purchase_option(String value) {
		boolean val = Boolean.parseBoolean(value);
	    register.purchase_option(val);
	}
	@And("agrees the terms and condition")
	public void agrees_the_terms_and_condition() throws InterruptedException {
	    register.terms_and_condition();
	}
	@And("user clicks on submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
	   register.click_on_submit();
	}
	@And("user verifies the MFA {string}")
	public void user_verifies_the_mfa(String string) throws InterruptedException {
	    register.MFA_authentication(string);
	}
	@Then("account should be created successfully")
	public void account_should_be_created_successfully() {
	   System.out.println("Account created successfully");
	}
}