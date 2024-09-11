package stepDefinations;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CreateAccount;
import pages.InputErrorValidation;
import utils.DriverFactory;

public class ErrorValidationStep {
	private InputErrorValidation inputErrors=new InputErrorValidation(DriverFactory.getDriver());
	private CreateAccount createAcc=new CreateAccount(DriverFactory.getDriver());
	
	@Given("user navigates to Magento website url")
	public void user_navigates_to_magento_website_url() {
		DriverFactory.getDriver().get("https://magento.softwaretestingboard.com/");
	}

	@Given("user clicks Create an Account link")
	public void user_clicks_create_an_account_link() {
		createAcc.clickAccLink();
	}

	@Then("user should get {string} error message under first name field.")
	public void user_should_get_error_message_under_first_name_field(String expectedFirstNameError) {
		String actualFirstNameError =inputErrors.validateFirstNameInputError();
		Assert.assertTrue(actualFirstNameError.contains(expectedFirstNameError));
	}

	@Then("user should get {string} error message under last name field.")
	public void user_should_get_error_message_under_last_name_field(String expectedLastNameError) {
		String actualLastNameError=inputErrors.validateLastNameInputError();
		Assert.assertTrue(actualLastNameError.contains(expectedLastNameError));
	}

	@Then("user should get {string} error message under email field.")
	public void user_should_get_error_message_under_email_field(String expectedEmailError) {
		String actualEmailError=inputErrors.validateEmailInputError();
		Assert.assertTrue(actualEmailError.contains(expectedEmailError));
	}

 
}
