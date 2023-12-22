package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.time.Duration;
public class TestBase {
    public static WebDriver driver;
    @Parameters("browserName")
    @BeforeSuite
    public void setUp(String browserName){
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get("https://practice.automationtesting.in");
    }
    @BeforeSuite
    public void tearDown() {

        driver.quit();
    }
    public static void waitForVisibilityOfElement(WebElement element, int secs) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(secs));
        wait.until(ExpectedConditions.visibilityOf(element));}
}
