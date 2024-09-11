Feature: Account login

   
      Scenario: user navigates to magento website nad logs in with valid login data
      Given user navigates to Magento website
      When user clicks on Sign In link
      And user inputs valid user name as "john@lara.com"
      And user enters valid password "John@2025"
      And user clicks on Sign In button 
      Then user validates greeting text "Welcome, Lara John!".