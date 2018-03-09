package griddemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridDemo
{
    @Test
    public void gridDemoTest() throws MalformedURLException
    {
        DesiredCapabilities capabilities=DesiredCapabilities.firefox();
        WebDriver driver =new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),capabilities);
        driver.get("https://www.google.com");
        driver.quit();
    }
}
