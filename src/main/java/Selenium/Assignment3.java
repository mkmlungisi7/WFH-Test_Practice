package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment3 {
    @Test
    public void method3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
        WebDriverWait wait = new WebDriverWait(driver, 5);


        driver.findElement(By.xpath("//*[@id=\"content\"]/a[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results")));

        System.out.println(driver.findElement(By.id("results")).getText());

    }
}