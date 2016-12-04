Feature: Google Search
  #Scenario for ui tests

  Scenario: As a user I would like to perform search operation at the Google search engine

    Given I navigate to Google home page
    And I enter key word into search field
    Then I check if search results are correct



