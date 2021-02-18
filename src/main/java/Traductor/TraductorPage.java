package Traductor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class TraductorPage {

    WebDriver driver;
    By fieldTranslate = By.xpath("//*[@class='er8xn']");
    By result = By.xpath("//div[@class='J0lOec']");

    public TraductorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void writeWord(String word) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(fieldTranslate).isDisplayed();
        driver.findElement(fieldTranslate).sendKeys(word);
    }

    public String translatedWord() {
        driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
        driver.findElement(result).isDisplayed();
        return driver.findElement(result).getText();
    }
}
