Feature: Register
  As a user
  I want to login to application
  So that I can make a new account

  @register
  Scenario: As a user I have successfully registered
    Given me on the register page
    When I enter a full name "Basma Ronanta"
    And I entered a email "basmaronanta28@gmail.com"
    And I entered a password "mylove366"
    And I click the register button
    Then I'm on the login page

  Scenario: As a user I registered with incorrect data filled numbers
    Given me on the register page
    When I enter a full name "ba5ma"
    And I entered a email "basmatest@gmail.com"
    And I entered a password "testaja1"
    And I click the register button
    Then I'm on the login page

  Scenario: As a user I registered with incorrect data filled character
    Given me on the register page
    When I enter a full name "b@5sma!)"
    And I entered a email "basmatest@gmail.com"
    And I entered a password "testaja1"
    And I click the register button
    Then I'm on the login page

  Scenario: As a user I register with the data that has been registered
    Given me on the register page
    When I enter a full name "Basma Ronanta"
    And I entered a email "basmaronanta28@gmail.com"
    And I entered a password "mylove366"
    And I click the register button
    Then I can see error message

  Scenario: As a user I registered with incomplete data
    Given me on the register page
    When I enter a full name ""
    And I entered a email "basmatest@gmail.com"
    And I entered a password "testaja1"
    And I click the register button
    Then I can see error message
