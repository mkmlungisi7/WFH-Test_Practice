package TestingUsingRestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//needs more work!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class SerialTest {

    public static void main(String [] args){
        RestAssured.baseURI="https://rahulshettyacademy.com";


    AddPlace p=new AddPlace();

        p.setAccuracy(50);
        p.setAddress("29, side layout, cohen 09");
        p.setLanguage("XItsonga");
        p.setPhone_number("(+91) 983 893 3937");
        p.setWebsite("https://rahulshettyacademy.com");
        p.setName("Frontline house");
        List<String> myList = new ArrayList<String>();
        myList.add("shoe park");
        myList.add("shop");

       // p.setTypes(myList);
        Location l = new Location();
        l.setLat(000000008.383494);
        l.setLng(33.427362);

    Response response=   RestAssured.given().log().all().queryParam("key","qaclick123")
         .body(
            p)
            .when().post("/maps/api/place/add/json").then().assertThat().statusCode(200).extract().response();;
    System.out.println(response.asString());
    }
}
