Feature: Inline error validation 
	Background:
    Given user navigates to Magento website url
    And user clicks Create an Account link
    
	Scenario: Inline error validations for first name input field
  When user enters Last Name as "Devid"
  And user enters Email as "<Email>"
  And user click on Create an Account button
	Then user should get "This is a required field." error message under first name field.

  
  Scenario: Inline error validations for last name input field
    When user enters First Name as "John"
    And user enters Email as "<Email>"
    And user click on Create an Account button
		Then user should get "This is a required field." error message under last name field.


    
    Scenario: Inline error validations for email input field
     When user enters First Name as "John"
     And user enters Last Name as "Devid"
     And user click on Create an Account button
		 Then user should get "This is a required field." error message under email field.
