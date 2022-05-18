Feature: Computer page Test
  As a user I want to check computer page to nopcommerce website

  Scenario: User should navigate to computer page by clicking on computer tab
    Given I am on homePage
    When I click on computer tab
    Then I am navigate to computer page

  Scenario:User should navigate to Desktop page by clicking on desktop tab
    Given I am on homePage
    When I click on computer tab
    And I click on Desktop tab
    Then I am navigate to desktop page


  Scenario Outline: verify That User Should Build Your Own Computer And Add Them To Cart Successfully
    Given I am on homePage
    When I click on computer tab
    And I click on Desktop tab
    And I click on product name Build your own computer
    And I select processor "<processor>"
    And I select ram "<ram>"
    And I select hdd "<hdd>"
    And I select OS "<os>"
    And I select Software "<software>"
    And I click on add to cart button
    Then I should see product has been added to your shopping cart confirmation message

    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | VistaHome [+$50.00]     | Total Commander [+$5.00]   |
