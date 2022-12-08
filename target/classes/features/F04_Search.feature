@smoke
Feature: user Search Product

  Scenario Outline: user could search using product name
    Given user enter "<productname>" in Search field
    When user press on SEARCH button
    Then  user go to search results page "<productname>"
    Examples:
      |productname|
      |book|
      |laptop|
      |nike|

  Scenario Outline: user could search for product using sku
    Given user enter "<sku>" in Search field
    When user press on SEARCH button
    Then sku is displayed in product detail page "<sku>"
    Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|