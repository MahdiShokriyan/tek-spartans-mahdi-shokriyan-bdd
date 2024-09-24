Feature: This feature to validate everything related to order
  @UserStory8
  Scenario: Add product in cart and delete
    Given user click on "Sign in" link
    Then Validate user is in sign In page
    When user write on "Email" "Mahdi.mahdi1@gmail.com"
    When user write on "Password" "Password@123"
    When user click on "Login" button
    Then user should be able to see account link
    When user enter "TV" on search bar and click search
    Then validate search result contains "TV" for all products
    When user click on first item in search result
    When user click on "Add to Cart" button
    When user click on cart link
    Then verify 1 item in the cart list
    When user delete all items in cart
    Then validate shopping cart is empty