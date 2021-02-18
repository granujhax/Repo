import Common.ConfigurationDriver;
import Traductor.TraductorPage;
import com.thoughtworks.gauge.*;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;


public class StepImplementation {

    public WebDriver driver;

    @BeforeSpec
    public void setup() {
        ConfigurationDriver configurationDriver = new ConfigurationDriver();
        driver = configurationDriver.chromeConfiguration();
    }



    @Step("Navigate to <url>")
    public void implementation1(String url){
        driver.get(url);
        Gauge.captureScreenshot();
    }

    @Step("Enter hello <hello> in the field to translate")
    public void implementation2(String word){
        TraductorPage traductorPage = new TraductorPage(driver);
        traductorPage.writeWord(word);
        Gauge.captureScreenshot();
    }

    @Step("See hola <wortExpected> as the translated word")
    public void implementation4(String wortExpected) {
        TraductorPage traductorPage = new TraductorPage(driver);
        String result = traductorPage.translatedWord();
        Gauge.captureScreenshot();

        if (result.equalsIgnoreCase(wortExpected)){
            System.out.println("ok, resultado validado");
            
        }else{
            System.out.println("no se ubico el texto");
        }
    }



}
