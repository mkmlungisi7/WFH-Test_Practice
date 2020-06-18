package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @Test()
    public void autoSuggestive() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();


     /*   driver.get("https://www.makemytrip.com/");
       // driver.findElement(By.cssSelector("\"input[type='text']\"")).clear();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mum");

        driver.findElement(By.cssSelector("div[class='calc60']")).click();
       // driver.findElement(By.cssSelector("div[class='calc60']")).sendKeys(Keys.ENTER);
       WebElement element= driver.findElement(By.cssSelector("input[type='text']"));
       element.sendKeys("s");


       element.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(4000);
        element.sendKeys(Keys.ENTER);
        //needs more work
*/
    }
}
