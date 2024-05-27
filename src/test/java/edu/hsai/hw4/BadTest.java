package edu.hsai.hw4;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Feature("Bad test")
class BadTest extends DriverSetup {
    @Test
    @Story("This should be failed")
    public void testFailSiteName(){
        assertion.assertHomePageTitle("HEHEHE");
    }
}
