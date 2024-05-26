package edu.hsai.hw4;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Feature("First task using Steps")
class Task1Test extends DriverSetup {
    @Test
    @Story("Testing the Home Page")
    public void testTask1() {
        // 2. Assert browser title
        assertion.assertHomePageTitle(Expected.SITE_NAME);

        // 4. Assert Username is logged
        assertion.assertUsernameIsLoggined(Expected.LOGGED_USER_NAME);

        // 5. Assert that there are 4 items on the header section are displayed, and they have proper texts
        assertion.assertHeaderSectionItemsProperties(Expected.HEADER_SECTION_ITEMS_SIZE,
                Expected.HEADER_SECTION_ITEMS_NAMES);

        // 6. Assert that there are 4 images on the Index Page, and they are displayed
        assertion.assertIndexPageImages(Expected.BENEFIT_ICONS_SIZE);

        // 7. Assert that there are 4 texts on the Index Page under icons, and they have proper text
        assertion.assertIndexPageTexts(Expected.BENEFIT_ICONS_TEXTS_SIZE, Expected.BENEFIT_ICONS_TEXTS_STRINGS);

        // 8. Assert that there is the iframe with “Frame Button” exist
        assertion.assertFrameExistence();

        // 9. Switch to the iframe and check that there is “Frame Button” in the iframe
        assertion.assertFrameButtonExistence();

        // 10. Switch to original window back
        action.switchToOriginalWindow();

        // 11. Assert that there are 5 items in the Left Section are displayed, and they have proper text
        assertion.assertLeftSectionProperties(Expected.LEFT_SECTION_ITEMS_SIZE,
                Expected.LEFT_SECTION_ITEMS_NAMES);
    }
}
