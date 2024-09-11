Feature: Account registration functionality

  Scenario: Create an Account with Valid Credentials
    Given user navigates to magneto URL 
    When user clicks on Create an Account Button
		And user enters First Name as "John"
		And user enters Last Name as "Devid"
		And user enters Email as "<Email>"
		And user enters Password as "Devid@2024"
		And user enters Confirm Password as "Devid@2024"
		And user click on Create an Account button
		Then user validates successful message as "Thank you for registering with Main Website Store.".
  