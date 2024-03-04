Feature: Verify categories

  @GetCategories
  Scenario: Get Category info from Categories API
    When I send GET to Category API
    Then I should see Category API status OK
    Then I should see valid Category Id
    Then I should see valid Category Name
    Then I should see valid Category Thumb
    Then I should see valid Category Description is exists
