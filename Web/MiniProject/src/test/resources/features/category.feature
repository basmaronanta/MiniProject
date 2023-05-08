Feature: Category Product
  As a user
  I want to see product category
  So that I can choose category

  @category
  Scenario: As user i have be able to select category
    Given I am on the home page1
    When I click select category
    And I click category gaming
    Then I can see product category message "Products is empty!"

  Scenario: As user i have be able to select category and click clear category
    Given I am on the home page1
    When I click select category
    And I click category gaming
    Then I can see product category message "Products is empty!"
    And I click clear button
    And I go to home page