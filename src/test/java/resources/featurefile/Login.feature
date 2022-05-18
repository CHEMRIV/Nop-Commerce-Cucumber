Feature:Login Test
    As a user I want to login in to nopcommerce website


  Scenario: User should navigate to login page successfully
    Given I am on homePage
    When  I click on login link
    Then I should navigate to log in page successfully

  Scenario: User should login successfully with valid credentials
    Given I am on homePage
    When I click on login link
    And I enter email "joypotter123@gmail.com"
    And I enter password "123456"
    And I click on login button
    Then I should login successfully

  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homePage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email              | password | errorMessage                                                                                |
      | herry123@gmail.com | 123456   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | joy123@gmail.com   | 452636   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | kljbbb@gmail.com   | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | zedfyhg@gmail.com  |          | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |

  Scenario: Verify User should  logout successfully
    Given I am on homePage
    When I click on login link
    And I enter email "joypotter123@gmail.com"
    And I enter password "123456"
    And I click on login button
    And I click on logout button
    Then I should logout successfully