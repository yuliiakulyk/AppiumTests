package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yuliia Kulyk on 30.01.2017.
 */
public class BaseScreen {
    public By burgerMenu = By.id("menu");
    public AndroidDriver driver;
    public By musicMenu1 = By.id("music");
    public By profileMenu1 = By.id("profile");

    public BaseScreen(AndroidDriver driver) {
        this.driver = driver;
    }

//    @AndroidFindBy(id = "menu")
//    public MobileElement menuButton;
//
//    @AndroidFindBy(id = "music")
//    public MobileElement musicMenu;
//
//    @AndroidFindBy(id = "profile")
//    public MobileElement profileMenu;

    public void navigateToMenu(MenuOptions menu) {
        switch (menu) {
            case MUSIC:
                driver.findElement(burgerMenu).click();
                driver.findElement(musicMenu1).click();
                break;
            case PROFILE:
                driver.findElement(burgerMenu).click();
                driver.findElement(profileMenu1).click();
                break;
            default:
                break;


        }
    }


    public enum MenuOptions {
        MUSIC,
        PROFILE,
        CHATS,
        SKINS,
        EVENTS,
        EQUALIZER,
        TIMER_ALARM,
        INFO
    }
}
