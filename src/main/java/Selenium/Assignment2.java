package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment2 {

    @Test()
    public void method1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com/");

        new Select(driver.findElement(By.id("Adults"))).selectByValue("4");
        new Select(driver.findElement(By.id("Childrens"))).selectByValue("3");

        driver.findElement(By.cssSelector(".depart_date.keyValue.span.span24.required.hasDatepicker.placeholder")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
        driver.findElement(By.cssSelector(".blue.rArrow")).click();
        driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indingo");
        driver.findElement(By.id("SearchBtn")).click();
       System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());




    }
}
