Feature: Wikipedia search functionality and verification

  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When user types "Bill Gates" in the wiki search page
    And user click wiki search button
    Then user sees "Bill Gates" is in the wiki title

    Scenario: Wikipedia Search Functionality Header Verification
      Given User is on Wikipedia home page
      When user types "Steve Jobs" in the wiki search page
      And user click wiki search button
      Then user sees "Steve Jobs" is in the main header
@scenarioOutline
  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When user types "<searchValue>" in the wiki search page
    And user click wiki search button
    Then user sees "<expectedTitle>" is in the wiki title
    Then user sees "<expectedMainHeader>" is in the main header

    Examples: search values we are going to be using in this scenario is as below
      | searchValue  | expectedTitle | expectedMainHeader |  |
      | Steve Jobs   | Steve Jobs    | Steve Jobs         |  |
      | Bob Marley   | Bob Marley    | Bob Marley         |  |
      | Chuck Norris | Chuck Norris  | Chuck Norris       |  |
      | Marie Curie  | Marie Curie    | Marie Curie         |  |


