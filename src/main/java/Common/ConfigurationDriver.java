package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class ConfigurationDriver {
    public WebDriver driver;

    public WebDriver chromeConfiguration(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();

        return driver;
    }

}
