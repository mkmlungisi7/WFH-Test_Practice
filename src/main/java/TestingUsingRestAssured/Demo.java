package TestingUsingRestAssured;

import io.restassured.RestAssured;


import org.testng.annotations.Test;

import java.util.Random;


public class Demo {
 @Test
    public void getMethod() {
        int i = new Random().nextInt(100);
        System.out.println(i);
        Tester demo = new Tester(i, "json-server" + i, "typicode" + i);


        RestAssured.baseURI = "http://localhost:3000";
//        Response response = given().header("contentType", "application/json").
//                body(demo.toString()).when().post("/posts").
//                then().statusCode(201).log()
//                .all().and().extract().
//                        response();
//        System.out.println("resposne is  " + response.prettyPrint());
//        Gson gson = new GsonBuilder().create();
//        Dem3 dem;
//        dem = gson.fromJson(response.prettyPrint(), Dem3.class);

        //  System.out.println(gson.fromJson(response.prettyPrint(),MyTest.Dem3.class).getAuth());
//
//
//        Assert.assertEquals(demo.getAuth(), dem.getAuth());
//        Assert.assertEquals(demo.getTitle(), dem.getTitle());
//        Assert.assertEquals(demo.getId(), dem.getId());


    }
}


