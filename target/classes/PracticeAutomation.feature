Feature: Regression Testing for Practice Automation webapp

  Scenario: Asserting Thinking in HTML book exists along with its price
    Given Go to Practice Automation webapp
    Then Assert "Thinking in HTML" book exists with its price
  Scenario: Clicking on Add to Basket for Thinking in HTML book
    When Click on Add to Basket for Thinking in HTML book
    Then Assert the book is added to the basket
  Scenario: Clicking on Shopping Cart and Asserting Item added to cart with its details
    When Click on shopping cart
    Then Assert the book is added to cart with its details
  Scenario: Clicking on Proceed to Checkout
    When Click on Proceed to Checkout
    Then Assert Billing Details form displayed
    Then Close the webapp
