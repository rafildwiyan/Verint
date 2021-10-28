Feature: FirstPage

  Scenario: Open Verint website and verify text
    Given Launch Browser
    When  Open website
    Then Search
    And Verify text