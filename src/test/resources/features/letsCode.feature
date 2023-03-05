Feature: letscode web page input practices


  Scenario: letsCode input functionality tests
    Given user on the letscode input web page
    When user write fullname on EnterFullNameInput
    And user uses Tab key and write text on next input
    And user goes next input and read text on next input
    And user goes next input and clear the text on next input
    And user confirms next input is disabled
    And user goes next input and confirm input is readonly
    Then user close the window

  Scenario: letsCode button functionality tests
    Given user on the letscode button web page
    When user clicks GoTo Home button and navigate to Back
    And user find location of FindLocation button
    And user prints What is my color button color
    And user prints heights and width
    And user confirms button is disabled
    And user Click and Hold Button and sees name is Button has been long pressed
    Then user close the window

    Scenario: xxx
      Given user on the xxx button web page

