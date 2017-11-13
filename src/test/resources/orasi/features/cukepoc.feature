Feature: Proving that the cucumber addin is functioning properly

  Scenario: Right clicking tests to invoke addin
    Given I have right clicked this code
    When I run as cucumber feature
    Then I should see console output telling me how to implement these steps