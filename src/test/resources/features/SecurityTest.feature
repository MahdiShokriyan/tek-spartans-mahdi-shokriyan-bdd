Feature: this future is for user story 1

  Scenario: Navigate to sign in page and sign in with valid username and possword and validate
    user successfully signed in

    When user click on sign in link
    Then Validate user is in sign In page
    When user enter "mahdi.mahdi1@gmail.com" and "Mahdi123!" and click on login
    Then user should be able to see account link