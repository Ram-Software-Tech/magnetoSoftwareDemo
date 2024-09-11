package stepDefinations;


import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountLogin;
import utils.DriverFactory;

public class AccLoginSteps {
	
	private AccountLogin loginAcc=new AccountLogin(DriverFactory.getDriver());
	

	@Given("user navigates to Magento website")
	public void user_navigates_to_magento_website() {
		DriverFactory.getDriver().get("https://magento.softwaretestingboard.com/");
	}

	@When("user clicks on Sign In link")
	public void user_clicks_on_sign_in_link() {
		loginAcc.clickonSignInLink();
	}

	@When("user inputs valid user name as {string}")
	public void user_inputs_valid_user_name_as(String username) {
		loginAcc.enterEmail(username);
	}

	@When("user enters valid password {string}")
	public void user_enters_valid_password(String password) {
		loginAcc.enterPass(password);
	}


	@When("user clicks on Sign In button")
	public void user_clicks_on_sign_in_button() {
		loginAcc.clickSignBtn();
	}

	@Then("user validates greeting text {string}.")
	public void user_validates_greeting_text(String greetMsg) {
		String greetText=loginAcc.verifyLoginMsg();
		Assert.assertTrue(greetText.contains(greetMsg));
	}
}
