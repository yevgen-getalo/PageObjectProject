package PageObject;

import Utils.Path;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    HomePage(WebDriver driver) {
        super(driver);
    }

    public void newPage1() {
        driver.get(Path.ICT_URL);
    }
}
