package PageObject;

import Utils.Path;
import org.openqa.selenium.WebDriver;
import static org.testng.AssertJUnit.assertTrue;

public class Google extends BasePage {

    public Google(WebDriver driver) {
        super(driver);
    }

    public HomePage newPage() {
        driver.get(Path.GOO_URL);
        assertTrue(driver.getCurrentUrl().contains("google.com"));
        return new HomePage(driver);
    }
}
