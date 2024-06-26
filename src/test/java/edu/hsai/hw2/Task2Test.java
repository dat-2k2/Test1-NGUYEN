package edu.hsai.hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

class Task2Test extends DriverSetup {
    @Test
    public void testBrowserTitle() {
        // 2. Assert browser title
        assertEquals(driver.getTitle(), "Home Page");
    }

    @Test
    public void testLogin() {
        // 4. Assert Username is loggined
        assertEquals(driver.findElement(By.id("user-name")).getText(), "ROMAN IOVLEV");
    }

    @Test
    public void testElements() {
        // 5. Open through the header menu Service -> Different Elements Page
        driver.findElement(By.cssSelector("body > header > div > nav > ul.uui-navigation.nav.navbar-nav.m-l8 > li > a > span")).click();
        driver.findElement(By.xpath("/html/body/header/div/nav/ul[1]/li[3]/ul/li[8]/a")).click();

        // 6. Select checkboxes
        driver.findElements(By.className("label-checkbox")).stream()
                .filter(checkbox -> checkbox.getText().equals("Water") || checkbox.getText().equals("Wind"))
                .forEach(WebElement::click);

        // 7. Select radio
        driver.findElements(By.className("label-radio")).stream()
                .filter(radio -> radio.getText().equals("Selen"))
                .forEach(WebElement::click);

        // 8. Select in dropdown
        driver.findElements(By.tagName("option")).stream()
                .filter(option -> option.getText().equals("Yellow"))
                .forEach(WebElement::click);

        // 9. Assert logs
        final int LOGS_BEGIN_INDEX = 9;

        var logLines = Arrays.stream(driver.findElement(By.cssSelector("ul.panel-body-list.logs")).getText()
                .split("\n")).map(line -> line.substring(LOGS_BEGIN_INDEX)).toList();

        assertEquals(logLines, List.of("Colors: value changed to Yellow", "metal: value changed to Selen",
                "Wind: condition changed to true", "Water: condition changed to true"));
    }
}
