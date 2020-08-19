package JavaUsingTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {

    @Test(groups = {"regression"})
    public void A() {

        System.out.println("Hello");
    }

    @Test(dependsOnMethods = {"A"})//depends on the A() to executes
    public void B() {

        System.out.println("Hi");
    }

    @Test(dataProvider = "data")
    public void C(String username,String passoword) {

        System.out.println(username+" "+passoword);
    }

    @DataProvider
    public Object[][] data() {
        Object[][] data = new Object[3][2];
        data[0][0] = "1st_userName";
        data[0][1] = "1st_password";
        data[1][0] = "2nd_USername";
        data[1][1] = "2nd_Passoword";
        data[2][0] = "3rd_Username";
        data[2][1] = "3rd_Passord";

        return data;


    }

}
