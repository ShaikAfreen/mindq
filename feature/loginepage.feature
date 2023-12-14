#Login feature testcase

Feature: Login page
  I want to login successfully

@smoke
  Scenario Outline: Title of your scenario
    Given User is on login page
    When user enters right username "<username>"
    And user enters password "<password>"
    And click on submit
    Then Browser close

Examples:
|username|password|
|skafreen100@gmail.com|Farheen@12|
|username2|password2|
  