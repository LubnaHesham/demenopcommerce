@smoke
Feature: user could choose sub category from main categories
  Scenario: verify that there are 3 main categories contains sub-categories
    Given user hover on random category
    When user select random subcategory
    And user click on selected sub category
    And  gettext for page title
    Then  sub-category page open successfully