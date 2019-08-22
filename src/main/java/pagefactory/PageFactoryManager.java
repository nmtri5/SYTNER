package pagefactory;

import org.openqa.selenium.WebDriver;
import pageobject.HomePageObjects;

public class PageFactoryManager{

    public static HomePageObjects getHomePage(WebDriver driver){
        return new HomePageObjects(driver);
    }

}


