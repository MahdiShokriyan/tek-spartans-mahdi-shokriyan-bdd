Feature: this future to setup framework
@Smoke
  Scenario: validate top left corner logo in retail app

    Then validate top left corner is TEKSCHOOL

@Smoke
    Scenario: Validate top left corner logo and sign in button in retail app
      Then validate top left corner is TEKSCHOOL
      Then Validate Sign in Button is Enabled


