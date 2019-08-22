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

public class MenuItems extends AbstractTest {
    WebDriver driver;
    HomePageObjects homePage;
    String aboutUsLink = "https://www.sytner.co.uk/about-us/",
            newsLink = "https://www.sytner.co.uk/news/",
            customerServiceLink = "https://www.sytner.co.uk/customer-service/",
            careersLink = "https://careers.sytner.co.uk/",
            financeLink = "https://www.sytner.co.uk/finance/",
            usedCarSearchLink = "https://supersearch.sytner.co.uk/",
            newCarsLink = "https://www.sytner.co.uk/new-cars/",
            carMaintenanceLink = "https://www.sytner.co.uk/car-maintenance/",
            promotionLink = "https://www.sytner.co.uk/promotions/",
            businessUsersLink = "https://www.sytner.co.uk/business-users/",
            sellYourCarLink = "https://www.sytner.co.uk/sell-your-car/",
            dealerLocatorLink = "https://www.sytner.co.uk/dealer-locator/";

    String parent;
    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browser) {
        driver = openBrowser(browser, Constants.STAGING_URL);

        homePage = PageFactoryManager.getHomePage(driver);
        parent = homePage.getWindowHandle(driver);
    }

    @Test
    public void MenuItems_001_AboutUs() {
        log.info("About Us - Step 01: Click on About us menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "About Us");

        log.info("About Us - VP: About Us Page is displayed");
        verifyTrue(homePage.isPageTitleDisplayed(driver,"About Us"));

        log.info("About Us - VP: The link is displayed");
        verifyEquals(homePage.getCurrentPageUrl(driver), aboutUsLink);
    }

    @Test
    public void MenuItems_002_News() {
        log.info("News - Step 01: Click on News menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "News");

        log.info("News - VP: News Page is displayed");
        verifyTrue(homePage.isPageTitleDisplayed(driver,"News"));

        log.info("News - VP: The link is displayed");
        verifyEquals(homePage.getCurrentPageUrl(driver), newsLink);
    }

    @Test
    public void MenuItems_003_CustomerService() {
        log.info("News - Step 01: Click on Customer Service menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "Customer Service");

        log.info("News - VP: Customer Service Page is displayed");
        verifyTrue(homePage.isPageTitleDisplayed(driver,"Customer Service"));

        log.info("News - VP: The link is displayed");
        verifyEquals(homePage.getCurrentPageUrl(driver), customerServiceLink);
    }

    @Test
    public void MenuItems_004_Careers() {
        log.info("News - Step 01: Click on News menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "Careers");

        log.info("News - VP: Careers Page is displayed");
        verifyTrue(homePage.isPageTitleDisplayed(driver,"Careers"));

        log.info("News - VP: The link is displayed");
        verifyTrue(homePage.getCurrentPageUrl(driver).contains(careersLink));

        log.info("News - Step 02: Close the child window");
        homePage.closeAllExceptParentWindows(driver, parent);
    }

    @Test
    public void MenuItems_005_Finance() {
        log.info("News - Step 01: Click on Finance menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "Finance");

        log.info("News - VP: Finance Page is displayed");
        verifyTrue(homePage.isPageTitleDisplayed(driver,"Finance"));

        log.info("News - VP: The link is displayed");
        verifyEquals(homePage.getCurrentPageUrl(driver), financeLink);
    }

    @Test
    public void MenuItems_007_UsedCarSearch() {
        log.info("Used Car Search - Step 01: Click on Used Car Search menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "Used Car Search");

        log.info("Used Car Search - VP: Used Car Search Page is displayed");
        verifyTrue(homePage.isCarSearchPageDisplayed());

        log.info("Used Car Search - VP: The link is displayed");
        verifyTrue(homePage.getCurrentPageUrl(driver).contains(usedCarSearchLink));

        log.info("Used Car Search - Post-condition: Return to Homepage");
        homePage.backToPreviousPage(driver);
    }

    @Test
    public void MenuItems_008_NewCars() {
        log.info("New Cars - Step 01: Click on New Cars menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "New Cars");

        log.info("New Cars - VP: New Cars Page is displayed");
        verifyTrue(homePage.isPageTitleDisplayed(driver, "New Cars"));

        log.info("New Cars - VP: The link is displayed");
        verifyEquals(homePage.getCurrentPageUrl(driver), newCarsLink);
    }

    @Test
    public void MenuItems_009_CarMaintenance() {
        log.info("Car Maintenance - Step 01: Click on Servicing & Parts menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "Servicing & Parts");

        log.info("Car Maintenance - VP: Servicing & Parts Page is displayed");
        verifyTrue(homePage.isPageTitleDisplayed(driver, "Car maintenance"));

        log.info("Car Maintenance - VP: The link is displayed");
        verifyEquals(homePage.getCurrentPageUrl(driver), carMaintenanceLink);
    }
    @Test
    public void MenuItems_010_Promotions() {
        log.info("Promotions - Step 01: Click on Offers menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "Offers");

        log.info("Promotions - VP: Offers Page is displayed");
        verifyTrue(homePage.isPageTitleDisplayed(driver, "Car Offers"));

        log.info("Promotions - VP: The link is displayed");
        verifyEquals(homePage.getCurrentPageUrl(driver), promotionLink);
    }

    @Test
    public void MenuItems_011_BusinessUsers() {
        log.info("Business Users - Step 01: Click on Business Users menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "Business Users");

        log.info("Business Users - VP: Business Users Page is displayed");
        verifyTrue(homePage.isPageTitleDisplayed(driver, "Business Users"));

        log.info("Business Users - VP: The link is displayed");
        verifyEquals(homePage.getCurrentPageUrl(driver), businessUsersLink);
    }
    @Test
    public void MenuItems_012_SellYourCar() {
        log.info("Sell Your Car - Step 01: Click on Sell Your Cars menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "Sell your car");

        log.info("Sell Your Car - VP: Offers Page is displayed");
        verifyTrue(homePage.isPageTitleDisplayed(driver, "Sell Your Car"));

        log.info("Sell Your Car - VP: The link is displayed");
        verifyEquals(homePage.getCurrentPageUrl(driver), sellYourCarLink);
    }
    @Test
    public void MenuItems_013_DealerLocator() {
        log.info("Dealer Locator - Step 01: Click on Our Locations menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "Our Locations");

        log.info("Dealer Locator - VP: Our Locations Page is displayed");
        verifyTrue(homePage.isPageTitleDisplayed(driver, "Our Locations"));

        log.info("Dealer Locator - VP: The link is displayed");
        verifyEquals(homePage.getCurrentPageUrl(driver), dealerLocatorLink);
    }

    @Test
    public void MenuItems_014_HomeIcon() {
        log.info("Home Icon - Step 01: Click on Our Locations menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "Our Locations");

        log.info("Home Icon - Step 02: Click on Home Icon Menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "Home");

        log.info("Home Icon - VP: The link is displayed");
        verifyTrue(homePage.isHomePageDisplayed());
    }

    @Test
    public void MenuItems_015_SytnerGroupLogo() {
        log.info("Sytner Group Logo - Step 01: Click on Our Locations menu item");
        homePage.clickToAnyHeaderOrMenuItemLink(driver, "Our Locations");

        log.info("Sytner Group Logo - Step 02: Click on Home Icon Menu item");
        homePage.clickToSytnerLogoIcon();

        log.info("Sytner Group Logo - VP: The link is displayed");
        verifyTrue(homePage.isHomePageDisplayed());
    }

    @AfterClass
    public void AfterClass() {
        closeBrowserAndDriver(driver);
    }
}
