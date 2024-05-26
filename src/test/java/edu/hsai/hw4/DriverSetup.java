package edu.hsai.hw4;

import edu.hsai.hw4.steps.Action;
import edu.hsai.hw4.steps.Assertion;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

class DriverSetup {
    protected static WebDriver driver;
    protected static Action action;
    protected static Assertion assertion;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        Dotenv dotenv = Dotenv.configure().load();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        action = new Action(driver, dotenv);
        assertion = new Assertion(driver, dotenv);

        // 1. Open test site by URL
        action.navigateToHomePage();

        // 3. Perform login
        action.performLogin();
    }

    @AfterTest
    public void exit() {
        //10. Close Browser
//        driver.close(); This method invokes a Connection reset error on driver.
        driver.quit();
    }
}
