package ebentv.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * Created by Yuliia Kulyk on 11.04.2017.
 */
public class BaseScreen {
    AndroidDriver driver;

    public By homeTab = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]");
    public By categoriesTab = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]");
    public By favoritesTab = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]");
    public By searchIcon = By.id("com.aws3.ebentv:id/search");
    public By contextMenu = By.id("com.aws3.ebentv:id/menu");
    public By screenTitle = By.id("com.aws3.ebentv:id/title");
    public By menuInfo = By.id("com.aws3.ebentv:id/info");
    public By menuLogOut = By.id("com.aws3.ebentv:id/logout");
    public By ads = By.xpath("//android.view.View[contains(@resource-id,'activity_main')]/android.widget.LinearLayout[2]");


    public BaseScreen(AndroidDriver driver) {
        this.driver = driver;
    }

    public <T extends BaseScreen> T navigateToScreen(Screens screen, T instanceOfScreen) {
        switch (screen) {
            case HOME:
                driver.findElement(homeTab).click();
                return instanceOfScreen;
            case CATEGORIES:
                driver.findElement(categoriesTab).click();
                return instanceOfScreen;
            case FAVORITES:
                driver.findElement(favoritesTab).click();
                return instanceOfScreen;
            case SEARCH:
                driver.findElement(searchIcon).click();
                return instanceOfScreen;
            case PLAYER:
                return instanceOfScreen;
            default:
                return instanceOfScreen;
        }
    }

    public enum Screens {
        HOME,
        CATEGORIES,
        FAVORITES,
        SEARCH,
        PLAYER
    }

}
