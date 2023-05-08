Feature: Login
  As a user
  I want to make the transaction
  So that I can login to application

  @login
  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter email "basmaronanta28@gmail.com"
    And I enter password "mylove366"
    And I click login button
    Then I am on the home page

  Scenario: As user i have be able to failed login with account unregistered
    Given I am on the login page
    When I enter email "basmatest12@gmail.com"
    And I enter password "mylove366"
    And I click login button
    Then I can see error message "record not found"

  Scenario: As user i have be able to failed login with invalid password
    Given I am on the login page
    When I enter email "basmaronanta28@gmail.com"
    And I enter password "mylove111"
    And I click login button
    Then I can see error message "email or password is invalid"

  Scenario: As user i have be able to failed login with password not filled
    Given I am on the login page
    When I enter email "basmaronanta28@gmail.com"
    And I enter password ""
    And I click login button
    Then I can see error message "password is required"

  Scenario: As user i have be able to failed login with email not filled
    Given I am on the login page
    When I enter email ""
    And I enter password "mylove366"
    And I click login button
    Then I can see error message "email is required"

  Scenario: As user i have be able to failed login with email and password not filled
    Given I am on the login page
    When I enter email ""
    And I enter password ""
    And I click login button
    Then I can see error message "email is required"