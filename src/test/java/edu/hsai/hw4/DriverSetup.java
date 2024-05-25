package edu.hsai.hw3;

import edu.hsai.hw3.pages.home.HomePage;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

class DriverSetup {
    protected static WebDriver driver;

    protected static HomePage homePage;

    @BeforeTest
    public void setup() {

        var properties = new Properties();
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        Dotenv dotenv = Dotenv.configure().load();


        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver, dotenv.get("url"));
        // Perform login
        homePage.performLogin(dotenv.get("name"), dotenv.get("password"));
    }

    @AfterTest
    public void exit() {
        //10. Close Browser
//        driver.close(); This method invokes a Connection reset error on driver.
        driver.quit();
    }
}
