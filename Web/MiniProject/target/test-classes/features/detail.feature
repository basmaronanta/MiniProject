Feature: Detail Product
  As a user
  I want to see detail product
  So that I can click button detail

  @detail
  Scenario: As user i have be able to see detail product Sony PS5
    Given I am on the home page2
    When I click detail button Sony PS5
    Then I can see product detail

#  Scenario: As user i have be able to see detail product Furniture
#    Given I am on the home page
#    When I click detail button Furniture
#    Then I can see product detail