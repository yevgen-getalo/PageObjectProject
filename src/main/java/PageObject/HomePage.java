package PageObject;

import Utils.Path;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertTrue;

public class HomePage extends BasePage {
    HomePage(WebDriver driver) {
        super(driver);
    }

    public void newPage1() {
        driver.get(Path.ICT_URL);
        assertTrue(driver.getCurrentUrl().contains("demo.ict4apps"));
    }
}
