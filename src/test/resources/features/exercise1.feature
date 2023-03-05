Feature: Register User

  Scenario:

  Given Navigate to url "http://automationexercise.com" and verify home page is visible successfully
  When Click on Signup Login button and Verify New User Signup! is visible
  And Enter name and email address and Click Signup button and Verify that ENTER ACCOUNT INFORMATION is visible
  And Fill details: Title, Name, Email, Password, Date of birth
  And Select checkbox Sign up for our newsletter! and Select checkbox Receive special offers from our partners!
  And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
  And Click Create Account button and Verify that ACCOUNT CREATED! is visible
  And Click Continue button and Verify that Logged in as username is visible
  Then Click Delete Account button and Verify that ACCOUNT DELETED! is visible and click Continue button