import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/diana/automation test/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.waivio.com");
//        driver.findElement(By.name("q")).sendKeys("java maven");
//        driver.findElement(By.name("btnK")).click();
        assert(true);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
