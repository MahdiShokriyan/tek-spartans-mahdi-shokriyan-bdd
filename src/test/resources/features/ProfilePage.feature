@Regression
Feature: this is Story No 5


  Background:Login to retail app and sign in with credential
    When user click on sign in link
    Then Validate user is in sign In page
    When user enter "mahdi.mahdi1@gmail.com" and "Mahdi123!" and click on login


  Scenario: Navigate to retail app, log in , and change your name and phone number
    When user click on "Account" link
    Then Validate user is in Account Page
    When user update "Name" and "Phone Number"

