Feature: As a user I sould add/update/delete proudcts

  Scenario: Validate add items to the basket
    Given I'm on basket page
    When  I search for the product "T-shirt"
    And I choose a product "Classic polo white"
    And I select size "M"
    And I click add to basket button
    Then  I should see the product in the basket


#  Scenario Outline: Validate adding multiple items to basket
#
#    Given I'm on basket page
#    When  I search for the product "<searchTerm>"
#    And I choose a product "<ProductName>"
#    And I select size "<size>"
#    And I click add to basket button
#    Then  I should see the product in the basket
#
#    Examples:
#
#      | searchTerm  | ProductName   | size  |
#      | T-shirt     | White t-shirt | m     |
#      | Jeans       | Next slim     | 32    |

#//li[@data-section='myAccount']  //TagName[attributeName = 'Value']
