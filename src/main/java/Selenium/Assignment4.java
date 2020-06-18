package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Assignment4 {
    @Test
    public void Assignment4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//*[@id='content']/div/a")).click();
        Set<String> set=  driver.getWindowHandles();
        Iterator<String> iterator= set.iterator();
        String parent= iterator.next();
        String child=iterator.next();
        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.cssSelector(".example")).getText());
        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText());

    }
}