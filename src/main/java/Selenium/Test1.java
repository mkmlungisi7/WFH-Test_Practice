package Selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test1 {

    @Test()
    public void method1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        //testing using static drop down
        //using dynamic drop downs
        //and also handling checkboxs
        //selecting from the calender
        //handling pop up alerts
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[value='IXB']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        Select select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        select.selectByValue("USD");
        Assert.assertFalse(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());
        driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"));
//driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(7000);
        driver.close();

    }
}
