Feature: Proving that the cucumber addin is functioning properly

  Scenario: Google search
    Given I have google opened
    When I search for a "insurance"
    Then I should see results that relate to "insurance"