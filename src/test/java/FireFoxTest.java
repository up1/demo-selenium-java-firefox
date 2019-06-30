import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class FireFoxTest {

    private WebDriver browser;

    @Before
    public void init() {
        // https://github.com/mozilla/geckodriver/releases
        // version 0.24.0
        // Firefox browser version 67.0.4
        // https://github.com/mozilla/geckodriver/issues/1483
        System.setProperty("webdriver.gecko.driver", "/Users/somkiat/data/slide/java/selenium/geckodriver");
        browser = new FirefoxDriver();
    }

    @After
    public void releaseResources() {
        browser.close();
    }



    @Test
    public void open_google_in_firefox_browser() {
        browser.get("https://www.google.com");
        WebElement q = browser.findElement(By.name("q"));
        assertTrue((q.isDisplayed()));


    }

}
