package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test7 {

@Test
    public void method7() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.path2usa.com/travel-companions");
Thread.sleep(9000);
        driver.findElement(By.id("travel_date")).click();
    while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
    {
        driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
    }

     List<WebElement> lis= driver.findElements(By.cssSelector(".day"));
     System.out.println("the size is "+lis.size());
     for(int i=0;i<lis.size();i++){
       String s= driver.findElements(By.cssSelector(".day")).get(i).getText();
         System.out.println(s);
         if(s.equalsIgnoreCase("30")){
             System.out.println("in  the if statement");
             driver.findElements(By.cssSelector(".day")).get(i).click();
             break;
         }
     }
    }
}
