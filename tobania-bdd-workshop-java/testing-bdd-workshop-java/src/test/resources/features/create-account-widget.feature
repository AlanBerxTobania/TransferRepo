Feature:
  As a user
  I want to be able to move to the login page of the website
  so I can create an account if I would want that.

  @CreateAccount
  Scenario: Create an account starting from the homepage
    Given Gert is on the homepage
    When Gert clicks Sign in
    Then The Sign in widget is opened
    When Gert enters his email address
    And Gert clicks Create an account
    Then the create account form is opened
    When the create account form is populated with the personal information of Gert
    And when the register button is pressed
    Then the account is logged in
    And the my account widget is opened
