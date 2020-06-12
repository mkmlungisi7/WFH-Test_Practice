package Selenium;

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
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        Thread.sleep(2000);
driver.findElement(By.cssSelector("a[value='IXB']")).click();
        Thread.sleep(2000);
driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
Select select=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
select.selectByValue("USD");
driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();



    }
}
