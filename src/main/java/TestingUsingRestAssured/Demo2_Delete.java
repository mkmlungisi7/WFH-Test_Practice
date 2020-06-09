package TestingUsingRestAssured;

import io.restassured.RestAssured;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Demo2_Delete {

    @Test
    public void  postMethod(){
        RestAssured.baseURI= "http://localhost:3000";

//        given().contentType("application/json").when().delete("/posts/3").then().statusCode(200).log().all();


}

}
