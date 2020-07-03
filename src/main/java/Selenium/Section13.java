package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.security.sasl.SaslServer;
import java.util.List;

public class Section13 {

    @Test
    public void method13() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.soccerladuma.co.za/match_centre/league/south-african-premier-soccer-league/table");
        List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"match-centre-tabs\"]/div[3]/div/table/tbody/tr/td[4]"));
        int total = 0;
        for(int i=0;i<list.size();i++){
             total+=Integer.parseInt( list.get(i).getText());


        }
        System.out.println("the sum is :"+ total);
    }
}
