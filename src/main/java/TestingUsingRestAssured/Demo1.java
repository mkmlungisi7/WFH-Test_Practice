package TestingUsingRestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class Demo1 {
    @Test
    public  void main() {
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = RestAssured.given().log().all().queryParam("key", "qaclick123").header("Content-Type", "Application/json")
                .body("{\n" +
                        "  \"location\": {\n" +
                        "    \"lat\": -38.383494,\n" +
                        "    \"lng\": 33.427362\n" +
                        "  },\n" +
                        "  \"accuracy\": 50,\n" +
                        "  \"name\": \"Frontline house\",\n" +
                        "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                        "  \"address\": \"29, side layout, cohen 09\",\n" +
                        "  \"types\": [\n" +
                        "    \"shoe park\",\n" +
                        "    \"shop\"\n" +
                        "  ],\n" +
                        "  \"website\": \"http://google.com\",\n" +
                        "  \"language\": \"French-IN\"\n" +
                        "}").when()
                .post("maps/api/place/add/json")
                .then().assertThat().statusCode(200).body("scope", Matchers.equalTo("APP"))
                .extract().response().asString();
      //  System.out.println(response);
        JsonPath jsonPath=new JsonPath(response);
     String placeID= jsonPath.get("place_id");
          System.out.println(placeID);
RestAssured.given().log().all().queryParam("key","qaclick123").header("Content-Type","Application/json")
        .body("{\n" +
                "\"place_id\":\""+placeID+"\",\n" +
                "\"address\":\"KA Khoza, RSA\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}").when().put("maps/api/place/update/json").then().statusCode(200).log().all();

        String res=RestAssured.given().log().all().queryParam("key","qaclick123").queryParam("place_id",placeID)
                .when().get("maps/api/place/get/json").then().assertThat().statusCode(200).extract().response().asString();
        JsonPath js=new JsonPath(res);
        Assert.assertEquals("KA Khoza, RSA",  js.get("address"));

    }
}