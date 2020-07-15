package TestingUsingRestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {

    @Test
    public void main2() {
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        JsonPath js = new JsonPath(PayLoad.coursePrice());
        int count = js.getInt("courses.size()");
        System.out.println(count);
//printing the purchase amount
        int totalAmont = js.getInt("dashboard.purchaseAmount");
        System.out.println(totalAmont);
        //printig the Title of the first course

        //getting all the courses titles

        int output = 0;
        for (int i = 0; i < count; i++) {
            String courses = js.get("courses[" + i + "].title");

            int  price= js.get("courses[" + i + "].price");
            int copies= js.get("courses["+i+"].copies");
            output+= price*copies;

        }
        Assert.assertEquals(output,totalAmont);
System.out.println("worked");
    }
}
