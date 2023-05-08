Feature: Transaction
  As a user
  I want to buy product
  So that I can click button buy product

  @transaction
  Scenario: As user i make a product transaction
    Given I am on the login page1
    When I enter1 email "basmaronanta12@gmail.com"
    And I enter1 password "mylove366.,"
    And I click1 login button
#    And I am on the home page
    And I click buy button product
    And I click cart button
#    Then I am on the your cart page
    Then I click pay button
    And I am on the transaction information page

  Scenario: As user i make a product transaction and not complete purchase
    Given I am on the login page1
    When I enter1 email "basmaronanta12@gmail.com"
    And I enter1 password "mylove366.,"
    And I click1 login button
#    And I am on the home page
    And I click buy button product
    And I click cart button
#    Then I am on the your cart page
    Then I click the button to reduce the quantity
    And I can see cart page message "Order is empty!"

  Scenario: As user i make a product transaction and click buy button 7 times
    Given I am on the login page1
    When I enter1 email "basmaronanta12@gmail.com"
    And I enter1 password "mylove366.,"
    And I click1 login button
#    And I am on the home page
    And I click buy button product
    And I click buy button product
    And I click buy button product
    And I click buy button product
    And I click buy button product
    And I click buy button product
    And I click buy button product
    And I click cart button
#    Then I am on the your cart page
    Then I click pay button
    And I am on the transaction information page