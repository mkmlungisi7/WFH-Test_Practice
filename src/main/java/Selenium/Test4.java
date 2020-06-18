package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Test4 {

    @Test
    public void method4() throws InterruptedException {

        //using explicit and implicit wait

        System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<String> list = Arrays.asList("Brocolli", "Beans", "Carrot");

        process(list, driver);

        driver.findElement(By.cssSelector("[src='./images/bag.png']")).click();
        driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
        driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        //using Webdriverwait

       /* WebDriverWait w=new WebDriverWait(driver,5);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoinfo")));//defining an explicit wait
        System.out.println(driver.findElement(By.cssSelector("span.promoinfo")).getText());
        */

        FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(40,TimeUnit.SECONDS).
                pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
        WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                //this method returns if the element is available on the html code , and just because it is visible on the html
                //does not meam it is displayed,hence of the webdriverwait we used visibilityOfelemet so that the is a wait till
                //untill the element is displayed , so to solved this we have to use a if condition
                if (driver.findElement(By.cssSelector("span.promoinfo")).isDisplayed()) {
                    return driver.findElement(By.cssSelector("span.promoinfo"));
                } else
                    return null;
            }
        });

    }

    public void process(List list1, WebDriver driver) {


        List<WebElement> list = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < list.size(); i++) {

            String[] string = list.get(i).getText().split("-");
            String veg = string[0].trim();

            if (list1.contains(veg)) {

                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

            }


        }
    }
}
