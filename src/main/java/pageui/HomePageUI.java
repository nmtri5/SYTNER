package pageui;

public class HomePageUI {
    public static final String WELCOME_TEXT = "//span[text() = 'Welcome to the Sytner Group']";
    public static final String SYTNER_LOGO = "//div[@class ='logo module']//a[@title = 'Sytner Group Limited']";

    /** Jump Poins **/
    public static final String DYNAMIC_JUMP_POINT = "//div[contains(@class, 'jump module %s')]";

    /** Jump Poins Branch icon **/
    public static final String DYNAMIC_BRANCH_ICON = "//div[contains(@class, 'jump module %s')]//span[@class = 'content']";
}



