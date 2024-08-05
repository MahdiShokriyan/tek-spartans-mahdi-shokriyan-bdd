Feature: this future is for user story 4

  Scenario: Navigate to Create Account page and Create new Account Validate New Account Created.

    When user click on sign in link
    Then Validate user is in sign In page
    When user click on Create New Account Button
    Then Validate user is in "Sign Up" page
    When user enter "Mahdi " and "John126498@gmail.com" and "Password@123" and "Password@123" and  click on sign up link
    Then user should be able to see account link


  Scenario: Navigate to Create Account page and Create Account with Existing email and Validate Error message
    When user click on sign in link
    Then Validate user is in sign In page
    When user click on Create New Account Button
    Then Validate user is in "Sign Up" page
    When user enter "Mahdi " and "John126498@gmail.com" and "Password@123" and "Password@123" and  click on sign up link
    Then user should be able to see "this email is already exist, please use another email address"


