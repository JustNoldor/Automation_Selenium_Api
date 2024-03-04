Feature: Verify meal searches

  @SearchMealByName
  Scenario: Get Meal from API By Name
    When I send GET to Search By Name API
    Then I should see status OK
    Then I should see valid Meal Id
    Then I should see valid Meal
    Then I should see valid DrinkAlternate
    Then I should see valid Category
    Then I should see valid Area
    Then I should see strInstructions is exists
