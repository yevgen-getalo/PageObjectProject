package PageObject;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
