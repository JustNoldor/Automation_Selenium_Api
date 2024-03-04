package Utils;

import java.io.InputStream;
import java.util.Properties;

public class DataProperty {

    private static final String CONFIG_FILE = "data.properties";
    private static Properties properties;

    static {
        properties = new Properties();
        try (InputStream input = DataProperty.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (input == null) {
                System.out.println("Sorry, unable to find " + CONFIG_FILE);
            }
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getStatusCodeOk(){
        return properties.getProperty("STATUS_CODE_OK");
    }
    public String getDomain(){
        return properties.getProperty("DOMAIN");
    }
    public String getSearchEndpoint(){
        return properties.getProperty("SEARCH_ENDPOINT");
    }

    public String getCategoryEndpoint(){
        return properties.getProperty("SEARCH_CATEGORY_ENDPOINT");
    }
    public String getIdMeal() {
        return properties.getProperty("SEARCH_IdMeal");
    }
    public String getStrMeal() {
        return properties.getProperty("SEARCH_StrMeal");
    }
    public String getStrCategory() {
        return properties.getProperty("SEARCH_StrCategory");
    }
    public String getStrArea() {
        return properties.getProperty("SEARCH_StrArea");
    }

    public String getCategoryId() {
        return properties.getProperty("CATEGORY_IdCategory");
    }
    public String getCategoryName() {
        return properties.getProperty("CATEGORY_StrCategory");
    }
    public String getCategoryThumb() {
        return properties.getProperty("CATEGORY_StrCategoryThumb");
    }


}