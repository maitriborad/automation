Feature: Login functionality
  As a User I want to test Login functions.

  Background:
    Given User is on homepage
    When I accept cookies

  Scenario: User can not login with invalid credentials
    When User click on login button
    And User enter username "Maitri"
    And User enter password "Maitri@123"
    And User click on login tab
    Then User login not success with message "Incorrect username or password entered. Please try again"
