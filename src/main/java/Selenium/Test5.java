package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Test5 {

    @Test
    public void method5() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Using the Actions Class
       /* driver.get("https://www.amazon.com/");
          Actions actions = new Actions(driver);
          actions.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
          actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mlungisis")
          .build().perform();
         */
        //Switching between windows

      /*  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
        System.out.println(driver.getTitle());
            driver.findElement(By.cssSelector("[href='https://support.google.com/accounts?hl=en']")).click();
          Set<String> set=  driver.getWindowHandles();
      Iterator<String> iterator= set.iterator();
          String parent= iterator.next();
          String child=iterator.next();
          driver.switchTo().window(child);//switching to child window
          System.out.println(driver.getTitle());
        driver.switchTo().window(parent);//switch to parent
        System.out.println(driver.getTitle());*/

        //how to handle frames,and drag and drop
        driver.get("https://jqueryui.com/droppable/");
        WebElement el=driver.findElement(By.cssSelector(".demo-frame"));
        driver.switchTo().frame(el);
        driver.findElement(By.id("droppable")).click();
        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent(); //this switches back to the page

    }
}
