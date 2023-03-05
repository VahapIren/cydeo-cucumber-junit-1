Feature:Fleet Driver Login Function


  Scenario: Login as truck driver
    Given user is on the login page
    When user enters username
    And user enters password
    And user click login button
    Then user should see the "Quick Launchpad"