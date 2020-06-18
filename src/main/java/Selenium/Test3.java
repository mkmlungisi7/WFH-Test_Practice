package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Test3 {
    @Test
    public void method3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> list = driver.findElements(By.cssSelector("h4.product-name"));
      List<String> list1=Arrays.asList("Brocolli","Beans","Carrot");
        for (int i = 0; i < list.size(); i++) {

            String[] string = list.get(i).getText().split("-");
            String veg=string[0].trim();

            if (list1.contains(veg)) {
                System.out.println(veg);
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

            }


        }


    }
}
