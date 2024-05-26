package edu.hsai.hw4;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Feature("Second task using Steps")
class Task2Test extends DriverSetup {
    @Test
    @Story("Testing the Different Elements page")
    public void testTask2() {
        // 2. Assert browser title
        assertion.assertHomePageTitle(Expected.SITE_NAME);

        // 4. Assert Username is loggined
        assertion.assertUsernameIsLoggined(Expected.LOGGED_USER_NAME);

        // 5. Open through the header menu Service -> Different Elements Page
        action.navigateToDifferentElementsPage();

        // 6. Select checkboxes
        action.selectCheckboxes("Water", "Wind");

        // 7. Select radio
        action.selectRadio("Selen");

        // 8. Select in dropdown
        action.selectDropdownOption("Yellow");

        // 9. Assert logs
        assertion.assertLogs(Expected.DIFFERENT_ELEMENTS_LOGS);
    }
}
