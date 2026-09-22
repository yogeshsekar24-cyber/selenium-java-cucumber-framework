package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps{
	LoginPage log = new LoginPage();
	HomePage home = new HomePage();

    @Given("user clicks on Account button and lands on login page")
    public void clicks_on_account_button_and_lands_on_login_page() {
    	
    	home.click_on_account_button();
    }

    @When("user enters valid email ID {string} and password {string}")
    public void user_enters_valid_email_and_password(String username, String password) {
    	
    	log.enter_user_name_and_password(username, password);
    }

    @And("user clicks on Sign in button")
    public void user_clicks_on_sign_in_button() {
    	log.click_on_signIn_button();

        System.out.println("User clicks on Sign in button");
    }

    @Then("check whether user successfully navigated to home page")
    public void check_whether_user_successfully_navigated_to_home_page() {

        home.click_on_myaccount_and_get_homepage_url();
    }

    @Then("user gets error message in login page")
    public void check_whether_user_gets_error_message_in_login_page() {
log.check_error_message();
    }
}