Feature: Top Menu Test
  As a user I want to test TopMenu

  Background:
    Given User is on homepage
    When I accept cookies

  Scenario: User can see all options in Top menu of Homepage
    Then User can see all option on TopMenuBar
    |      options   |
    |      Sports    |
    |      In:play   |
    |      Casino    |
    |   Live Casino  |
    | Virtual Sports |
    |   Promotions   |