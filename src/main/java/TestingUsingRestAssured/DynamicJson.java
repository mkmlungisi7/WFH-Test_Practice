package TestingUsingRestAssured;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicJson {
    @BeforeMethod
    public void before() {
        RestAssured.baseURI = "http://216.10.245.166";

    }

    @Test(dataProvider = "books")
    public void addbook(String aisle, String isbn) {
        String response = RestAssured.given().
                header("Content-Type", "Application/json").
                body(PayLoad.Books(aisle, isbn))
                .when().post("Library/Addbook.php").then().
                        assertThat().statusCode(200).
                        extract().response().asString();

    }

    @DataProvider(name = "books")
    public Object[][] getData() {
        return new Object[][]{{"first", "1"}, {"second", "2"}, {"three", "3"}};
    }

    @Test(dataProvider = "books")
    public void delete(String aisle, String isbn) {
        RestAssured.given().header("Content-Type", "application/json").body(PayLoad.Books(aisle, isbn))
                .when().post("/Library/DeleteBook.php").then().assertThat().statusCode(200);

    }  @Test(dataProvider = "books")
    public void get(String aisle, String isbn) {

       String s= RestAssured.given().body(PayLoad.Books(aisle, isbn)).when().get("Library/GetBook.php?ID=3389").then()
                .assertThat().statusCode(200).extract().response().asString();
       System.out.println(s);
    }
}
