@Regression
Feature: this is Story No 5


  Background:Login to retail app and sign in with credential
    When user click on sign in link
    Then Validate user is in sign In page
    When user enter "mahdi.mahdi1@gmail.com" and "Mahdi123!" and click on login


  Scenario: Navigate to retail app, log in , and change your name and phone number
    When user click on "Account" link
    Then Validate user can see "Your Profile"
    When user write on "Name" "Mahdi Jan"
    When user write on "Phone Number" "1234567538"
    Then user click on "Update" button
    Then Validate Toast Displayed
    When user write on "Name" "Mahdi"
    When user write on "Phone Number" "1234567538"
    Then user click on "Update" button
