import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoTest extends Base{

    @Test
    public void openbrowserofchoice(){
        WebDriver driver = downloaddriver(browserNames.CHROME);
        driver.manage().window().maximize();
        driver.get("https://reedelsevier.sharepoint.com/sites/LNgcentral/Pages/Resources.aspx");
        System.out.printf(driver.getTitle());
        driver.close();
    }
}
