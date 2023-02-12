Feature: Example of Cucumber data table implementations

  @wip
  Scenario: List of fruits I like
    Then user should see fruits I like
      | Kiwi        |
      | Banana      |
      | cucumber    |
      | orange      |
      | mango       |
      | grape       |
      | pomegranate |
    #to beatufy the lines
    # ctrl+alt+L
