package Services;

import Utils.DataProperty;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CategoriesService {

    DataProperty dataProperty;

    public CategoriesService() {
        dataProperty = new DataProperty();
    }

    private String getEndpoint(){
        return dataProperty.getDomain()+dataProperty.getCategoryEndpoint();
    }

    public Response getCategoryResponse(){
        return given().contentType(ContentType.JSON).when().get(getEndpoint());
    }

    public String getStatus(){
        return String.valueOf(getCategoryResponse().getStatusCode());
    }
    public String getCategoryId() {
        return getCategoryResponse().then().extract().path("categories[0].idCategory");
    }

    public String getCategoryName() {
        return getCategoryResponse().then().extract().path("categories[0].strCategory");
    }
    public String getCategoryThumb() {
        return getCategoryResponse().then().extract().path("categories[0].strCategoryThumb");
    }

    public boolean isDescriptionExists() {
        return getCategoryResponse().then().extract().path("categories[0].strCategoryDescription").toString().length()>20;
    }

}
