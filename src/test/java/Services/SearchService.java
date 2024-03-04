package Services;

import Utils.DataProperty;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class SearchService {
    DataProperty dataProperty;

    public SearchService() {
        dataProperty = new DataProperty();
    }
    private String getEndpoint(){
        return dataProperty.getDomain()+dataProperty.getSearchEndpoint();
    }

    public Response getSearchByNameResponse(){
        return given().contentType(ContentType.JSON).when().get(getEndpoint());
    }
    public String getStatus(){
        return String.valueOf(getSearchByNameResponse().getStatusCode());
    }
    public String getMealId() {
        return getSearchByNameResponse().then().extract().path("meals[0].idMeal");
    }

    public String getMealName() {
        return getSearchByNameResponse().then().extract().path("meals[0].strMeal");
    }

    public String getDrinkAlternate() {
        return getSearchByNameResponse().then().extract().path("meals[0].strDrinkAlternate");
    }

    public String getCategory() {
        return getSearchByNameResponse().then().extract().path("meals[0].strCategory");
    }

    public String getArea() {
        return getSearchByNameResponse().then().extract().path("meals[0].strArea");
    }

    public boolean isInstructionsExists() {
        return getSearchByNameResponse().then().extract().path("meals[0].strInstructions").toString().length()> 20;
    }

}
