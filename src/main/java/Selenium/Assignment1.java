package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment1 {

    @Test
    public void assignment1(){
      System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement webElement= driver.findElement(By.id("checkBoxOption1"));
     webElement.click();
    Assert.assertTrue( webElement.isSelected());
        webElement.click();
      Assert.assertFalse(webElement.isSelected());

      Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),3);

    }
}
