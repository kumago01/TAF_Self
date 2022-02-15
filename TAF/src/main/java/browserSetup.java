import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.print.DocFlavor;
import java.security.PublicKey;

public enum browserSetup {

    CHROME("chrome"), FIREFOX("firefox");
    private String browser;

    browserSetup(String browserName) {
        browserName = this.browser;
    }

//    public  WebDriverManager getWebDriverManager() {
//        switch (this) {
//            case FIREFOX:
//                return WebDriverManager.firefoxdriver();
//            break;
//            case CHROME:
//                return WebDriverManager.chromedriver();
//            default:
//                break;
//        }
//        return WebDriverManager;
//    }
//
//    public WebDriver getDriver() {
//        switch (this) {
//            case CHROME:
//                return new ChromeDriver();
//            break;
//            case FIREFOX:
//                return new FirefoxDriver();
//            break;
//            default:
//                break;
//        }
//    }
    }
