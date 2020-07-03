package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment6 {
    @Test
    public void assignment6() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        List<WebElement> list = driver.findElements(By.xpath("//*[@id='product']/tbody/tr"));
        int sum = 0;
        for (int i = 0; i < list.size(); i++) if (list.get(i).getText() != null) sum++;
        System.out.println("the number of rows is " + sum);

        List<WebElement> list2 = driver.findElements(By.xpath("//*[@id='product']/tbody/tr[1]/th"));
        int sum2 = 0;
        for (int i = 0; i < list2.size(); i++) if (list2.get(i).getText() != null) sum2++;
        System.out.println("the number of columns is " + sum2);

        String secondRow = driver.findElement(By.xpath("//*[@id='product']/tbody/tr[3]")).getText();
        System.out.println(secondRow);

    }

}
