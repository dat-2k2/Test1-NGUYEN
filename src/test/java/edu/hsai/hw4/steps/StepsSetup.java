package edu.hsai.hw4.steps;

import edu.hsai.hw4.pages.home.HomePage;
import edu.hsai.hw4.pages.others.OtherElements;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.WebDriver;

public abstract class StepsSetup {
    public static HomePage homePage;
    protected static WebDriver driver;
    protected static Dotenv dotenv;
    protected static OtherElements otherElements;

    public StepsSetup(WebDriver driver, Dotenv dotenv) {
        StepsSetup.driver = driver;
        StepsSetup.dotenv = dotenv;
    }
}