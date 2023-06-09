Feature: Login Data Driven

  Scenario Outline: Login Data Driven
    Given User Launch browser
    And opens URL "https://tutorialsninja.com/demo/"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login button
    Then User navigates to MyAccount Page

    Examples: 
      | email                   | password  |
      | mowadeswap93@gmail.com  | 123456789 |
      | nileshtraiing@gmail.com | mytest321 |
