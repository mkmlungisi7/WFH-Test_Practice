package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class Test8 {


    @Test
    public void method8() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/home/commandquality/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
           //Taking a screenshot with selenium
        /*
            driver.get("https://www.google.com/");
     File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("/home/commandquality/Pictures/SeleniumScreenShots/1st.png"));
        */


    }


    public void enablingDesiredCapabilities() {

//Desired capabilities=
//general chrome profile
        DesiredCapabilities ch = new DesiredCapabilities();
//ch.acceptInsecureCerts();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

//Belows to your local browser
        ChromeOptions c = new ChromeOptions();
        c.merge(ch);
        System.setProperty("webdriver.chrome.driver", "");
        WebDriver driver = new ChromeDriver(c);
    }
}
