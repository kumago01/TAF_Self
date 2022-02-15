
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

enum browserNames{
    FIREFOX,CHROME
}

public class Base {

    WebDriver driver;

    public WebDriver downloaddriver(browserNames browsername){
        switch (browsername){
            case FIREFOX:
                 WebDriverManager.firefoxdriver().setup();
                 driver = new FirefoxDriver();
                break;
            case CHROME:
                WebDriverManager.chromedriver().setup();
                break;
        }
        return driver;
    }


//    public WebDriver initializeDriver(browserSetup browser){
//        browser.getWebDriverManager().setup();
//        driver = browser.getDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        return driver;
//    }
}
