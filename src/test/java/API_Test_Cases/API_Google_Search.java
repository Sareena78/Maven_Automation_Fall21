package API_Test_Cases;

import Day9_010822.Reusable_Actions;
import Reusable_Library.Reusable_Annotations;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class API_Google_Search extends Reusable_Annotations {

    //set the baseurl/endpoint in beforeClass to call it only once
    @BeforeSuite
    public void setup(){
        RestAssured.baseURI="https://www.googleapis.com/customsearch/";
        RestAssured.basePath="/v1";
    }//end of set up

    @Test
    public void googleSearch() throws InterruptedException {
        //store the api key in a variable
        String apiKey = "AIzaSyDwiWKBKB0zHjsb3-IsXs-301sJ3CkyjdU";
        Response myResponse =
                given()
                        .queryParam("key",apiKey)
                        .queryParam("cx","09c4fb57ae0c4aafd")
                        .queryParam("q","Mercedes")
                        .when()
                        //get post put or delete method as part of when
                        .get()
                        .then()
                        .extract()
                        .response();

        //verify if the status code is 200
        if(myResponse.statusCode() == 200){
            System.out.println("Status code is 200 and successful");
            //this will return all the links within the item object in json
            List<String> linkCount = myResponse.path("items.link");
            //get all the tile within item object
            List<String> titleCount = myResponse.path("items.title");
            //System.out.println("titles: " + titleCount);
            //System.out.println("Links: " + linkCount.toString());
            //want to verify first link and the title of that link appears when I navigate
            driver.navigate().to(linkCount.get(0));
            Thread.sleep(2000);
            String actualTitle = Reusable_Actions.getTextMethod(driver,"//*[text()='Mercedes-Benz']","Title");
            if(actualTitle.equals(titleCount.get(0))){
                System.out.println("Title matches " + actualTitle);
            } else {
                System.out.println("Title doesn't match. Expected " + linkCount.get(0) + " and Actual " + actualTitle);
            }
        } else {
            System.out.println("Failed status code " + myResponse.statusCode());
        }

    }
}
