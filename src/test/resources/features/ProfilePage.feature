@Regression
Feature: this is Story No 5


  Background:Login to retail app and sign in with credential
    When user click on sign in link
    Then Validate user is in sign In page
    When user enter "mahdi.mahdi1@gmail.com" and "Mahdi123!" and click on login
    When user click on "Account" link
    Then Validate user can see "Your Profile"

  Scenario: Navigate to retail app, log in , and change your name and phone number


    When user write on "Name" "Mahdi Jan"
    When user write on "Phone Number" "1234567538"
    Then user click on "Update" button
    Then Validate Toast Displayed
    When user write on "Name" "Mahdi"
    When user write on "Phone Number" "1234567538"
    Then user click on "Update" button


    @Regression
    Scenario: Navigate to profile page and change your password
      When user write on "Previous Password" "Mahdi123!"
      When user write on "New Password" "Mahdi1234!"
      When user write on "Confirm Password" "Mahdi1234!"
      When user click on "Change Password" button
      Then Validate Toast Displayed
      When user write on "Previous Password" "Mahdi1234!"
      When user write on "New Password" "Mahdi123!"
      When user write on "Confirm Password" "Mahdi123!"
      When user click on "Change Password" button
