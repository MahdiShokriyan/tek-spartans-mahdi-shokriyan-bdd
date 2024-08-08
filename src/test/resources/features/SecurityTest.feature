@Smoke @Regression
Feature: this future is for user story 1

  Scenario: Navigate to sign in page and sign in with valid username and password and validate
  user successfully signed in

    When user click on sign in link
    Then Validate user is in sign In page
    When user enter "mahdi.mahdi1@gmail.com" and "Mahdi123!" and click on login
    Then user should be able to see account link

#  Scenario: Validate sign in with invalid username valid password
#    When user click on sign in link
#    Then Validate user is in sign In page
#    When user enter "mahdi.mahdi123@gmail.com" and "Mahdi123!" and click on login
#    Then user should see error "wrong username or password"
#
#  Scenario: Validate sign in with invalid username valid password
#    When user click on sign in link
#    Then Validate user is in sign In page
#    When user enter "mahdi.mahdi123@gmail.com" and "notpassword@11" and click on login
#    Then user should see error "wrong username or password"

  Scenario Outline:
    When user click on sign in link
    Then Validate user is in sign In page
    When user enter "<userName>" and "<password>" and click on login
    Then user should see error "wrong username or password"

    Examples:
      | userName                 | password       |
      | mahdi.mahdi123@gmail.com | Mahdi123!      |
      | mahdi.mahdi123@gmail.com | notpassword@11 |
      | mahdi.mahdi1@gmail.com   | notpassword    |