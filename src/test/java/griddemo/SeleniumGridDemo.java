package griddemo;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridDemo {

    public static void main(String args[]) throws MalformedURLException {
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
       // capabilities.setBrowserName("firefox");
       // capabilities.setPlatform(Platform.WIN10);
        WebDriver driver =new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),capabilities);
        driver.get("https://www.google.com");
    }
}
