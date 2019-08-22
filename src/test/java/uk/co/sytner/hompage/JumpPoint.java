package uk.co.sytner.hompage;

import commons.AbstractTest;
import commons.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pagefactory.PageFactoryManager;
import pageobject.HomePageObjects;

public class JumpPoint extends AbstractTest {
    WebDriver driver;
    HomePageObjects homePage;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browser) {
        driver = openBrowser(browser, Constants.STAGING_URL);

        homePage = PageFactoryManager.getHomePage(driver);
    }

    @Test
    public void TC_18_JumpPoints_001_Alpina() {
        log.info("JumpPoint Alpine - VP: Verify if Alpina jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("alpina"));

        log.info("JumpPoint Alpine - Step 01: Move On Alpina jump point");
        homePage.moveToAnyJumpPoint("alpina");

        log.info("JumpPoint Alpine - VP: Verify if Alpina icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("alpina"));

        log.info("JumpPoint Alpine - Step 02: Click On Alpina jump point");
        homePage.clickToSpecificJumpPoint("alpina");

        log.info("JumpPoint Alpine - VP: Verify if Alpina page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("alpina"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_19_JumpPoints_002_Audi() {
        log.info("JumpPoint Alpine - VP: Verify if Audi jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("audi"));

        log.info("JumpPoint Alpine - Step 01: Move On Audi jump point");
        homePage.moveToAnyJumpPoint("audi");

        log.info("JumpPoint Alpine - VP: Verify if Audi icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("audi"));

        log.info("JumpPoint Alpine - Step 02: Click On Audi jump point");
        homePage.clickToSpecificJumpPoint("audi");

        log.info("JumpPoint Alpine - VP: Verify if Audi page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("audi"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_20_JumpPoints_003_Bentley() {
        log.info("JumpPoint Alpine - VP: Verify if Bentley jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("bentley"));

        log.info("JumpPoint Alpine - Step 01: Move On Bentley jump point");
        homePage.moveToAnyJumpPoint("bentley");

        log.info("JumpPoint Alpine - VP: Verify if Bentley icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("bentley"));

        log.info("JumpPoint Alpine - Step 02: Click On Bentley jump point");
        homePage.clickToSpecificJumpPoint("bentley");

        log.info("JumpPoint Alpine - VP: Verify if Bentley page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("bentley"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_21_JumpPoints_004_BMW() {
        log.info("JumpPoint Alpine - VP: Verify if BMW jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("bmw"));

        log.info("JumpPoint Alpine - Step 01: Move On BMW jump point");
        homePage.moveToAnyJumpPoint("bmw");

        log.info("JumpPoint Alpine - VP: Verify if BMW icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("bmw"));

        log.info("JumpPoint Alpine - Step 02: Click On BMW jump point");
        homePage.clickToSpecificJumpPoint("bmw");

        log.info("JumpPoint Alpine - VP: Verify if BMW page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("bmw"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_22_JumpPoints_005_Ferrari() {
        log.info("JumpPoint Alpine - VP: Verify if Ferrari jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("ferrari"));

        log.info("JumpPoint Alpine - Step 01: Move On Ferrari jump point");
        homePage.moveToAnyJumpPoint("ferrari");

        log.info("JumpPoint Alpine - VP: Verify if Ferrari icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("ferrari"));

        log.info("JumpPoint Alpine - Step 02: Click On Ferrari jump point");
        homePage.clickToSpecificJumpPoint("ferrari");

        log.info("JumpPoint Alpine - VP: Verify if Ferrari page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("ferrari"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_23_JumpPoints_006_AstonMartin() {
        log.info("JumpPoint Alpine - VP: Verify if Aston Martin jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("aston-martin"));

        log.info("JumpPoint Alpine - Step 01: Move On Aston Martin jump point");
        homePage.moveToAnyJumpPoint("aston-martin");

        log.info("JumpPoint Alpine - VP: Verify if Aston Martin icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("aston-martin"));

        log.info("JumpPoint Alpine - Step 02: Click On Aston Martin jump point");
        homePage.clickToSpecificJumpPoint("aston-martin");

        log.info("JumpPoint Alpine - VP: Verify if Aston Martin page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("aston-martin"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_24_JumpPoints_007_Jaguar() {
        log.info("JumpPoint Alpine - VP: Verify if Jaguar jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("jaguar"));

        log.info("JumpPoint Alpine - Step 01: Move On Jaguar jump point");
        homePage.moveToAnyJumpPoint("jaguar");

        log.info("JumpPoint Alpine - VP: Verify if Jaguar icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("jaguar"));

        log.info("JumpPoint Alpine - Step 02: Click On Jaguar jump point");
        homePage.clickToSpecificJumpPoint("jaguar");

        log.info("JumpPoint Alpine - VP: Verify if Jaguar page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("jaguar"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_25_JumpPoints_008_LandRover() {
        log.info("JumpPoint Alpine - VP: Verify if LandRover jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("land-rover"));

        log.info("JumpPoint Alpine - Step 01: Move On LandRover jump point");
        homePage.moveToAnyJumpPoint("land-rover");

        log.info("JumpPoint Alpine - VP: Verify if LandRover icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("land-rover"));

        log.info("JumpPoint Alpine - Step 02: Click On LandRover jump point");
        homePage.clickToSpecificJumpPoint("land-rover");

        log.info("JumpPoint Alpine - VP: Verify if LandRover page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("landrover"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_26_JumpPoints_009_Lamborghini() {
        log.info("JumpPoint Alpine - VP: Verify if Lamborghini jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("lamborghini"));

        log.info("JumpPoint Alpine - Step 01: Move On Lamborghini jump point");
        homePage.moveToAnyJumpPoint("lamborghini");

        log.info("JumpPoint Alpine - VP: Verify if Lamborghini icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("lamborghini"));

        log.info("JumpPoint Alpine - Step 02: Click On Lamborghini jump point");
        homePage.clickToSpecificJumpPoint("lamborghini");

        log.info("JumpPoint Alpine - VP: Verify if Lamborghini page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("lamborghini"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_27_JumpPoints_010_SytnerSelect() {
        log.info("JumpPoint Alpine - VP: Verify if Sytner Select jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("sytner-select"));

        log.info("JumpPoint Alpine - Step 01: Move On Sytner Select jump point");
        homePage.moveToAnyJumpPoint("sytner-select");

        log.info("JumpPoint Alpine - VP: Verify if Sytner Select icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("sytner-select"));

        log.info("JumpPoint Alpine - Step 02: Click On Sytner Select jump point");
        homePage.clickToSpecificJumpPoint("sytner-select");

        log.info("JumpPoint Alpine - VP: Verify if Sytner Select page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("sytner-select"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_28_JumpPoints_011_Maserati() {
        log.info("JumpPoint Alpine - VP: Verify if Maserati jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("maserati"));

        log.info("JumpPoint Alpine - Step 01: Move On Maserati jump point");
        homePage.moveToAnyJumpPoint("maserati");

        log.info("JumpPoint Alpine - VP: Verify if Maserati icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("maserati"));

        log.info("JumpPoint Alpine - Step 02: Click On Maserati jump point");
        homePage.clickToSpecificJumpPoint("maserati");

        log.info("JumpPoint Alpine - VP: Verify if Maserati page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("maserati"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_29_JumpPoints_012_McLaren() {
        log.info("JumpPoint Alpine - VP: Verify if McLaren jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("mclaren"));

        log.info("JumpPoint Alpine - Step 01: Move On McLaren jump point");
        homePage.moveToAnyJumpPoint("mclaren");

        log.info("JumpPoint Alpine - VP: Verify if McLaren icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("mclaren"));

        log.info("JumpPoint Alpine - Step 02: Click On McLaren jump point");
        homePage.clickToSpecificJumpPoint("mclaren");

        log.info("JumpPoint Alpine - VP: Verify if McLaren page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("mclaren"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_30_JumpPoints_013_MercedesBenz() {
        log.info("JumpPoint Alpine - VP: Verify if MercedesBenz jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("mercedes-benz"));

        log.info("JumpPoint Alpine - Step 01: Move On MercedesBenz jump point");
        homePage.moveToAnyJumpPoint("mercedes-benz");

        log.info("JumpPoint Alpine - VP: Verify if MercedesBenz icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("mercedes-benz"));

        log.info("JumpPoint Alpine - Step 02: Click On MercedesBenz jump point");
        homePage.clickToSpecificJumpPoint("mercedes-benz");

        log.info("JumpPoint Alpine - VP: Verify if MercedesBenz page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("mercedes-benz"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_31_JumpPoints_014_Mini() {
        log.info("JumpPoint Alpine - VP: Verify if MINI jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("mini"));

        log.info("JumpPoint Alpine - Step 01: Move On MINI jump point");
        homePage.moveToAnyJumpPoint("mini");

        log.info("JumpPoint Alpine - VP: Verify if MINI icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("mini"));

        log.info("JumpPoint Alpine - Step 02: Click On MINI jump point");
        homePage.clickToSpecificJumpPoint("mini");

        log.info("JumpPoint Alpine - VP: Verify if MINI page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("mini"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_32_JumpPoints_015_Porsche() {
        log.info("JumpPoint Alpine - VP: Verify if Porsche jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("porsche"));

        log.info("JumpPoint Alpine - Step 01: Move On Porsche jump point");
        homePage.moveToAnyJumpPoint("porsche");

        log.info("JumpPoint Alpine - VP: Verify if Porsche icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("porsche"));

        log.info("JumpPoint Alpine - Step 02: Click On Porsche jump point");
        homePage.clickToSpecificJumpPoint("porsche");

        log.info("JumpPoint Alpine - VP: Verify if Porsche page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("porsche"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_33_JumpPoints_016_RollsRoyce() {
        log.info("JumpPoint Alpine - VP: Verify if Rolls Royce jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("rolls-royce"));

        log.info("JumpPoint Alpine - Step 01: Move On Rolls Royce jump point");
        homePage.moveToAnyJumpPoint("rolls-royce");

        log.info("JumpPoint Alpine - VP: Verify if Rolls Royce icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("rolls-royce"));

        log.info("JumpPoint Alpine - Step 02: Click On Rolls Royce jump point");
        homePage.clickToSpecificJumpPoint("rolls-royce");

        log.info("JumpPoint Alpine - VP: Verify if Rolls Royce page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("rolls-royce"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_34_JumpPoints_017_Seat() {
        log.info("JumpPoint Alpine - VP: Verify if SEAT jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("seat"));

        log.info("JumpPoint Alpine - Step 01: Move On SEAT jump point");
        homePage.moveToAnyJumpPoint("seat");

        log.info("JumpPoint Alpine - VP: Verify if SEAT icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("seat"));

        log.info("JumpPoint Alpine - Step 02: Click On SEAT jump point");
        homePage.clickToSpecificJumpPoint("seat");

        log.info("JumpPoint Alpine - VP: Verify if SEAT page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("seat"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_35_JumpPoints_018_Skoda() {
        log.info("JumpPoint Alpine - VP: Verify if Skoda jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("skoda"));

        log.info("JumpPoint Alpine - Step 01: Move On Skoda jump point");
        homePage.moveToAnyJumpPoint("skoda");

        log.info("JumpPoint Alpine - VP: Verify if Skoda icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("skoda"));

        log.info("JumpPoint Alpine - Step 02: Click On Skoda jump point");
        homePage.clickToSpecificJumpPoint("skoda");

        log.info("JumpPoint Alpine - VP: Verify if Skoda page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("skoda"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_36_JumpPoints_019_Smart() {
        log.info("JumpPoint Alpine - VP: Verify if smart jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("smart"));

        log.info("JumpPoint Alpine - Step 01: Move On smart jump point");
        homePage.moveToAnyJumpPoint("smart");

        log.info("JumpPoint Alpine - VP: Verify if smart icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("smart"));

        log.info("JumpPoint Alpine - Step 02: Click On smart jump point");
        homePage.clickToSpecificJumpPoint("smart");

        log.info("JumpPoint Alpine - VP: Verify if smart page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("smart"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_37_JumpPoints_020_Volkswagen() {
        log.info("JumpPoint Alpine - VP: Verify if Volkswagen jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("volkswagen"));

        log.info("JumpPoint Alpine - Step 01: Move On Volkswagen jump point");
        homePage.moveToAnyJumpPoint("volkswagen");

        log.info("JumpPoint Alpine - VP: Verify if Volkswagen icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("volkswagen"));

        log.info("JumpPoint Alpine - Step 02: Click On Volkswagen jump point");
        homePage.clickToSpecificJumpPoint("volkswagen");

        log.info("JumpPoint Alpine - VP: Verify if Volkswagen page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("volkswagen"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_38_JumpPoints_021_VolkswagenCommercial() {
        log.info("JumpPoint Alpine - VP: Verify if Volkswagen Commercial jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("volkswagen-commercial"));

        log.info("JumpPoint Alpine - Step 01: Move On Volkswagen Commercial jump point");
        homePage.moveToAnyJumpPoint("volkswagen-commercial");

        log.info("JumpPoint Alpine - VP: Verify if Volkswagen Commercial icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("volkswagen-commercial"));

        log.info("JumpPoint Alpine - Step 02: Click On Volkswagen Commercial jump point");
        homePage.clickToSpecificJumpPoint("volkswagen-commercial");

        log.info("JumpPoint Alpine - VP: Verify if Volkswagen Commercial page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("volkswagen-commercial"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @Test
    public void TC_39_JumpPoints_022_Volvo() {
        log.info("JumpPoint Alpine - VP: Verify if Volvo jump point is displayed");
        verifyTrue(homePage.isSpecificJumpPointDisplayed("volvo"));

        log.info("JumpPoint Alpine - Step 01: Move On Volvo jump point");
        homePage.moveToAnyJumpPoint("volvo");

        log.info("JumpPoint Alpine - VP: Verify if Volvo icon is displayed");
        verifyTrue(homePage.isJumpPointIconDisplayed("volvo"));

        log.info("JumpPoint Alpine - Step 02: Click On Volvo jump point");
        homePage.clickToSpecificJumpPoint("volvo");

        log.info("JumpPoint Alpine - VP: Verify if Volvo page is displayed");
        verifyTrue(homePage.isTheCarBranchLinkCorrected("volvo"));

        log.info("JumpPoint Alpine - Post-condition: Click to Sytner Logo to back to homepage");
        homePage.clickToSytnerLogoIcon();
    }

    @AfterClass
    public void tearDown() {
        closeBrowserAndDriver(driver);
    }

}
