@Regression @StoryNo5
Feature: this is Story No 5


  Background:Login to retail app and sign in with credential
    When user click on sign in link
    Then Validate user is in sign In page
    When user enter "mahdi.mahdi1@gmail.com" and "Password@123" and click on login
    When user click on "Account" link
    Then Validate user can see "Your Profile"

  Scenario: Navigate to retail app, log in , and change your name and phone number
    When user write on "Name" "John"
    When user write on "Phone Number" "9876543212"
    Then user click on "Update" button
    Then Validate Toast Displayed
    When wait for 6 seconds
    When user write on "Name" "Mahdi "
    When user write on "Phone Number" "5715654367"
    Then user click on "Update" button
    When wait for 6 seconds


    @Regression
    Scenario: Navigate to profile page and change your password
      When user write on "Previous Password" "Password@123"
      When user write on "New Password" "Mahdi1234!"
      When user write on "Confirm Password" "Mahdi1234!"
      When user click on "Change Password" button
      Then Validate Toast Displayed
      When wait for 6 seconds
      When user write on "Previous Password" "Mahdi1234!"
      When user write on "New Password" "Password@123"
      When user write on "Confirm Password" "Password@123"
      When user click on "Change Password" button
      Then Validate Toast Displayed
      When wait for 6 seconds
