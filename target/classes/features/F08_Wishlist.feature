@smoke
Feature: user could add product to Wishlist
  Scenario: user choose Wishlist button
    When user click on Wishlist button on this product HTC One M8 Android L 5.0 Lollipop
    Then verify the success message is displayed

    Scenario: the product must appear in wishlist page
      When user click on Wishlist button on this product HTC One M8 Android L 5.0 Lollipop
      And user click on close icon
      And user click on Wishlist Tab on the top of the page
      Then verifiy that the product appear in wishlist page
