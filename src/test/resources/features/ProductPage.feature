@regression
Feature: this is Story no 7

  Scenario: Navigate to Retail app and in landing page search for a product. Validate searched products display on the page.
    When user search for "Keyboard" and click on search
    Then Validate item is visible with "Keyboard" selector and contain "Keyboard"