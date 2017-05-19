package PageObject;

import Utils.Path;
import org.openqa.selenium.WebDriver;

public class Google extends BasePage {

    public Google(WebDriver driver) {
        super(driver);
    }

    public HomePage newPage() {
        driver.get(Path.GOO_URL);

        return new HomePage(driver);
    }
}
