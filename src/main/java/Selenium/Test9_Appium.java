package Selenium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Test9_Appium {

    @Test
    public void method9() throws MalformedURLException {
        File file2=new File("src");
        File file=new File(file2,"ApiDemos-debug.apk");
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"demo");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,file.getAbsoluteFile());
        AndroidDriver androidDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
    }

}
