package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @Test()
    public void autoSuggestive() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

/*
       driver.get("https://www.makemytrip.com/");
       // driver.findElement(By.cssSelector("\"input[type='text']\"")).clear();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mum");

        driver.findElement(By.cssSelector("div[class='calc60']")).sendKeys(Keys.ARROW_DOWN);
       // driver.findElement(By.cssSelector("div[class='calc60']")).sendKeys(Keys.ENTER);
       WebElement element= driver.findElement(By.cssSelector("input[type='text']"));
       element.sendKeys("s");


       element.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(4000);
        element.sendKeys(Keys.ENTER);
        //needs more work
*/

        driver.get("https://www.ksrtc.in");
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

        System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());

//Javascript DOM can extract hidden elements
//because selenium cannot identify hidden elements - (Ajax implementation)
//investigate the properties of object if it have any hidden text

//JavascriptExecutor
        JavascriptExecutor js= (JavascriptExecutor)driver;

        String script = "return document.getElementById(\"fromPlaceName\").value;";
        String text=(String) js.executeScript(script);
        System.out.println(text);
        int i =0;
//BENGALURU INTERNATION AIPORT
        while(!text.equalsIgnoreCase("BENGALURU INTATION AIPORT"))
        {
            i++;
            driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

            text=(String) js.executeScript(script);
            System.out.println(text);
            if(i>10)
            {
                break;
            }

        }

        if(i>10)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element  found");
        }
    }
}
