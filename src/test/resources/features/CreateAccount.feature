@Regression
Feature: this future is for user story 4

  @UserStory2
  Scenario: Navigate to Create Account page and Create new Account Validate New Account Created.

    When user click on sign in link
    Then Validate user is in sign In page
    When user click on Create New Account Button
    Then Validate user is in "Sign Up" page
    When user enter "Mahdi " and "random" and "Password@123" and click on sign up link
    Then user should be able to see account link

  @UserStory2
  Scenario: Navigate to Create Account page and Create Account with Existing email and Validate Error message
    When user click on sign in link
    Then Validate user is in sign In page
    When user click on Create New Account Button
    Then Validate user is in "Sign Up" page
    When user enter "Mahdi " and "mahdi.mahdi1@gmail.com" and "Mahdi123!" and click on sign up link
    Then user should be able to see "this email is already exist, please use another email address"

  @UserStory4.2
  Scenario: Navigate to Create new Account page and click sign up button without filling the form
  Validate all errors on all fields.
    When user click on sign in link
    Then Validate user is in sign In page
    When user click on Create New Account Button
    Then Validate user is in "Sign Up" page
    When user click on Sign Up button
    Then Validate the errors
      | name | Name is a required field             |
      | email | Email is a required field            |
      | password | Password is a required field         |
      | confirmPassword | Confirm Password is a required field |