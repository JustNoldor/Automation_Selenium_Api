package StepDefs;

import Services.SearchService;
import Utils.DataProperty;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchStepDef {
    private SearchService searchService;
    private DataProperty dataProperty;

    public SearchStepDef() {
        searchService = new SearchService();
        dataProperty = new DataProperty();

    }

    @When("I send GET to Search By Name API")
    public void sendGetSearchByNameApi() {
        searchService.getSearchByNameResponse();
    }

    @Then("I should see status OK")
    public void checkStatus() {
        Assert.assertEquals(dataProperty.getStatusCodeOk(), searchService.getStatus());
    }
    @Then("I should see valid Meal Id")
    public void checkMealId() {
        Assert.assertEquals(dataProperty.getIdMeal(),searchService.getMealId());
    }

    @Then("I should see valid Meal")
    public void checkMealName() {
        Assert.assertEquals(dataProperty.getStrMeal(),searchService.getMealName());
    }

    @Then("I should see valid DrinkAlternate")
    public void checkDrinkAlternate() {
        Assert.assertNull(searchService.getDrinkAlternate());
    }

    @Then("I should see valid Category")
    public void checkCategory() {
        Assert.assertEquals(dataProperty.getStrCategory(), searchService.getCategory());
    }

    @Then("I should see valid Area")
    public void checkArea() {
        Assert.assertEquals(dataProperty.getStrArea(), searchService.getArea());
    }


    @Then("I should see strInstructions is exists")
    public void iShouldSeeStrInstructionsIsExists() {
        Assert.assertTrue(searchService.isInstructionsExists());
    }
}
