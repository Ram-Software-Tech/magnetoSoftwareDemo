package stepDefinations;



import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateAccount;
import utils.ConfigRead;
import utils.DriverFactory;
import utils.EmailData;

public class AccountCreateStep {
	private String actualMsg;
	
	private CreateAccount createAcc=new CreateAccount(DriverFactory.getDriver());
	
	@Given("user navigates to magneto URL")
	public void user_navigates_to_magneto_URL() {
		
		
		DriverFactory.getDriver().get("https://magento.softwaretestingboard.com/");
	}

	@When("user clicks on Create an Account Button")
	public void user_clicks_on_create_an_account_button() {
		createAcc.clickAccLink();
	}

	@When("user enters First Name as {string}")
	public void user_enters_first_name_as(String firstname) {
		
		createAcc.setFirstName(firstname);
	}
	    

	@When("user enters Last Name as {string}")
	public void user_enters_last_name_as(String lastname) {
		createAcc.setastName(lastname);
	}

	@When("user enters Email as {string}")
	public void user_enters_email_as(String email) {
		email=EmailData.randomestring() + "@gmail.com";
		createAcc.setEmail(email);
	}

	@When("user enters Password as {string}")
	public void user_enters_password_as(String password) {
		createAcc.setPassword(password);
	}

	@When("user enters Confirm Password as {string}")
	public void user_enters_confirm_password_as(String confirmPass) {
		createAcc.setConfirmPass(confirmPass);
	}

	@When("user click on Create an Account button")
	public void user_click_on_create_an_account_button() {
		createAcc.clickAnAccBtn();
	}

	@Then("user validates successful message as {string}.")
	public void user_validates_successful_message_as(String expectedMsg) {
		actualMsg=createAcc.verifyTitle();
		Assert.assertTrue(actualMsg.contains(expectedMsg));
	    
	}
}
