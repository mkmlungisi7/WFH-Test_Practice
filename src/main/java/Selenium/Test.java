package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    @org.testng.annotations.Test()
    public void method() throws Exception{
       System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();


       driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("16004934@rcconnect.co.za");
        driver.findElement(By.name("pass")).sendKeys("Khoza@30");
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
//
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("path.p361ku9c"));
      driver.findElement(By.xpath("//*[contains(@class,'p361ku9c')]")).click();

        //div[@id='ntp-contents']/div/div[2]/div/div
        // driver.close();
        //driver.findElement(By.id("u_0_b")).click();
       // driver.navigate().back();//nevigates back

    }
}
