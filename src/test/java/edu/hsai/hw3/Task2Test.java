package edu.hsai.hw3;

import edu.hsai.hw3.pages.others.OtherElements;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2Test extends DriverSetup {
    @Test
    public void testBrowserTitle() {
        // 2. Assert browser title
        assertEquals(homePage.getTitle(), Expected.SITE_NAME);
    }

    @Test
    public void testLogin() {
        // 4. Assert Username is logged in
        assertEquals(homePage.getLoggedName(), Expected.LOGGED_USER_NAME);
    }

    @Test
    public void testElements() {
        // 5. Open through the header menu Service -> Different Elements Page
        var otherElements = new OtherElements(driver, homePage);

        // 6. Select checkboxes
        otherElements.selectCheckbox("Water");
        otherElements.selectCheckbox("Wind");

        // 7. Select radio
        otherElements.selectRadio("Selen");

        // 8. Select in dropdown
        otherElements.selectDropdownOption("Yellow");

        // 9. Assert logs
        assertEquals(otherElements.getLogs(), Expected.DIFFERENT_ELEMENTS_LOGS);
    }
}
