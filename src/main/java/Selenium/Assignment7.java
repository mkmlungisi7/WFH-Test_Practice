package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Assignment7 {

    @Test
    public void assignment7(){
        System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("sou");

        JavascriptExecutor js=(JavascriptExecutor)driver;
        String script = "return document.getElementById(\"autocomplete\").value;";
        String text=(String) js.executeScript(script);
        while(!text.equalsIgnoreCase("South Africa")){
            driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
            text=(String) js.executeScript(script);
        }
        if(text.equalsIgnoreCase("South Africa")){
            System.out.println("Country found");
        }else{
            System.out.println("Country not found");
        }
    }

}
