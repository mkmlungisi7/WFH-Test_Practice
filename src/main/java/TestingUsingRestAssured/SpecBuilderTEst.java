package TestingUsingRestAssured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SpecBuilderTEst {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://rahulshettyacademy.com";


        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .addQueryParam("key", "qaclick123").setContentType(ContentType.JSON).build();
        AddPlace p = new AddPlace();
        p.setAccuracy(50);
        p.setAddress("29, side layout, cohen 09");
        p.setLanguage("XItsonga");
        p.setPhone_number("(+91) 983 893 3937");
        p.setWebsite("https://rahulshettyacademy.com");
        p.setName("Frontline house");
        List<String> myList = new ArrayList<String>();
        myList.add("shoe park");
        myList.add("shop");

        p.setTypes(myList);
        Location l = new Location();
        l.setLat(000000008.383494);
        l.setLng(33.427362);

        p.setLocation(l);
        RequestSpecification res = given().spec(req)
                .body(p);
        ResponseSpecification recc = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        Response response = res.when().post("/maps/api/place/add/json").
                then().spec(recc).extract().response();

        String responseString = response.asString();
        String place_id= new JsonPath(responseString).get("place_id");
        System.out.println(responseString);
        System.out.println(place_id);

        String dec=res.queryParam("place_id",place_id).expect().defaultParser(Parser.JSON).when().get("/maps/api/place/get/json")
                .then().extract().response().asString();

      System.out.println(dec);
    }
}


