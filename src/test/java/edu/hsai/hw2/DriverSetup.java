package edu.hsai.hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

class DriverSetup {
    protected static WebDriver driver;


    @BeforeTest
    public void setup() {

        var properties = new Properties();
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");


        driver = new ChromeDriver();

        // 1. Open test site by URL
        driver.navigate().to("https://jdi-testing.github.io/jdi-light/index.html");

        // 3. Perform login
        driver.findElement(By.cssSelector("html > body > header > div > nav > ul.uui-navigation.navbar-nav.navbar-right > li > a > span"))
                .click();
        driver.findElement(By.id("name")).sendKeys("Roman");
        driver.findElement(By.id("password")).sendKeys("Jdi1234");
        driver.findElement(By.id("login-button")).click();
    }

    @AfterTest
    public void exit() {
        //10. Close Browser
//        driver.close(); This method invokes a Connection reset error on driver.
        driver.quit();
    }
}
