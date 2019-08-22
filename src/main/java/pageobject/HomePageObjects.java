package pageobject;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageui.HomePageUI;
import pageui.SearchPageUI;

public class HomePageObjects extends AbstractPage {
    WebDriver driver;

    public HomePageObjects (WebDriver driver) {
        this.driver = driver;
    }

    public boolean isCarSearchPageDisplayed() {
        return isElementDisplayed(driver, SearchPageUI.SEARCH_TEXTBOX);
    }

    public boolean isHomePageDisplayed() {
        return isElementDisplayed(driver, HomePageUI.WELCOME_TEXT);
    }

    public void clickToSytnerLogoIcon() {
        waitForElementVisible(driver, HomePageUI.SYTNER_LOGO);
        clickToElement(driver, HomePageUI.SYTNER_LOGO);
    }

    public boolean isSpecificJumpPointDisplayed(String carBranch) {
        return isElementDisplayed(driver, HomePageUI.DYNAMIC_JUMP_POINT, carBranch);
    }

    public void moveToAnyJumpPoint(String carBranch) {
        waitForElementVisible(driver, HomePageUI.DYNAMIC_JUMP_POINT, carBranch);
        hoverMouseToElement(driver, HomePageUI.DYNAMIC_BRANCH_ICON, carBranch);
    }

    public boolean isJumpPointIconDisplayed(String carBranch) {
        return isElementDisplayed(driver, HomePageUI.DYNAMIC_BRANCH_ICON, carBranch);
    }

    public void clickToSpecificJumpPoint(String carBranch) {
        waitForElementVisible(driver, HomePageUI.DYNAMIC_JUMP_POINT, carBranch);
        clickToElement(driver, HomePageUI.DYNAMIC_JUMP_POINT, carBranch);
    }

    public boolean isTheCarBranchLinkCorrected(String carBranch) {
        String url = getCurrentPageUrl(driver);
        return url.contains(carBranch);
    }
}
