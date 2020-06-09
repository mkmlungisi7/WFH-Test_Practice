package TestingUsingRestAssured;

import io.restassured.RestAssured;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

import static io.restassured.RestAssured.given;

public class Test1 {

    @Test
    public void getmethod()throws Exception {

        RestAssured.baseURI= "http://currencyconverter.kowabunga.net";
     FileInputStream fileInputStream= new FileInputStream(new File("/home/commandquality/IdeaProjects/Testing/src/main/java/MyTest/re1.xml"));
//http://currencyconverter.kowabunga.net/converter.asmx?wsd1
//   Response response= given().header("Content-Type","text/xml").and().body(fileInputStream).when().post("/converter.asmx").then().statusCode(200)
//            .and().log().all().extract().response();
//        XmlPath xmlPath=new XmlPath(response.asString());


    }
}
