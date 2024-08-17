@regression
Feature: this is Story no 7

  Scenario Outline: Navigate to Retail app and in landing page search for a product. Validate searched products display on the page.
    When user search for "<Search Keyword>" and click on search
    Then Validate item is visible with selector and contain "<Search Keyword>"

    Examples:
      | Search Keyword |
      | keyboard       |
      | Card           |
      | Mouse          |
      | TV             |
      | LED            |
      | Sony           |
      | LG             |
      | cisco          |
      | GB             |
