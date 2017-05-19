import PageObject.Google;
import PageObject.HomePage;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {
    HomePage homePage;
    Google google;

    @Test
    public void firstTest() {
        //homePage = new PageObject.HomePage(driver);
        google = new Google(driver);
        //google.newPage();
        homePage = google.newPage();
        homePage.newPage1();
    }
}
