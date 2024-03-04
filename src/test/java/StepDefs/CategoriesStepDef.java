package StepDefs;

import Services.CategoriesService;
import Utils.DataProperty;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CategoriesStepDef {
    private CategoriesService categoriesService;
    private DataProperty dataProperty;

    public CategoriesStepDef() {
        categoriesService = new CategoriesService();
        dataProperty = new DataProperty();

    }

    @When("I send GET to Category API")
    public void sendGetSearchByNameApi() {
        categoriesService.getCategoryResponse();
    }

    @Then("I should see Category API status OK")
    public void iShouldSeeCategoryAPIStatusOK() {
        Assert.assertEquals(dataProperty.getStatusCodeOk(),categoriesService.getStatus());
    }

    @Then("I should see valid Category Id")
    public void iShouldSeeValidCategoryId() {
        Assert.assertEquals(dataProperty.getCategoryId(),categoriesService.getCategoryId());
    }

    @Then("I should see valid Category Name")
    public void iShouldSeeValidCategoryName() {
        Assert.assertEquals(dataProperty.getCategoryName(),categoriesService.getCategoryName());
    }

    @Then("I should see valid Category Thumb")
    public void iShouldSeeValidCategoryThumb() {
        Assert.assertEquals(dataProperty.getCategoryThumb(),categoriesService.getCategoryThumb());
    }

    @Then("I should see valid Category Description is exists")
    public void iShouldSeeValidCategoryDescriptionIsExists() {
        Assert.assertTrue(categoriesService.isDescriptionExists());
    }
}
