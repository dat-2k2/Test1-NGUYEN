package edu.hsai.hw4.steps;

import edu.hsai.hw4.pages.home.HomePage;
import edu.hsai.hw4.pages.others.OtherElements;
import io.github.cdimascio.dotenv.Dotenv;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import java.util.stream.Stream;

public class Action extends StepsSetup {
    public Action(WebDriver driver, Dotenv dotenv) {
        super(driver, dotenv);
    }

    @Step("Navigating to Home Page")
    public void navigateToHomePage() {
        homePage = new HomePage(driver, dotenv.get("url"));
    }

    @Step("Logging in")
    public void performLogin() {
        homePage.performLogin(dotenv.get("name"), dotenv.get("password"));
    }

    @Step("Switching to the original window")
    public void switchToOriginalWindow() {
        homePage.switchToOriginalWindow();
    }

    @Step("Navigating to Different Elements page")
    public void navigateToDifferentElementsPage() {
        otherElements = new OtherElements(driver, homePage);
    }

    @Step("Selecting checkboxes")
    public void selectCheckboxes(String... names) {
        Stream.of(names).forEach(name -> otherElements.selectCheckbox(name));
    }

    @Step("Selecting radio")
    public void selectRadio(String name) {
        otherElements.selectRadio(name);
    }

    @Step("Selecting dropdown option")
    public void selectDropdownOption(String name) {
        otherElements.selectDropdownOption(name);
    }
}
