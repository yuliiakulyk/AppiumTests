package ebenradio.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * Created by Yuliia Kulyk on 30.01.2017.
 */
public class BaseScreen {
    public By burgerMenu = By.id("menu");
    public AndroidDriver driver;
    public By musicMenu = By.id("music");
    public By profileMenu = By.id("profile");
    public By chatsMenu = By.id("chats");
    public By skinsMenu = By.id("skins");
    public By eventsMenu = By.id("events");
    public By newsMenu = By.id("news");
    public By equalizerMenu = By.id("equalizer");
    public By alarmMenu = By.id("timer_alarm");
    public By infoMenu = By.id("info");


    public BaseScreen(AndroidDriver driver) {
        this.driver = driver;
    }

    public void navigateToMenu(MenuOptions menu) {
        switch (menu) {
            case MUSIC:
                driver.findElement(burgerMenu).click();
                driver.findElement(musicMenu).click();
                break;
            case PROFILE:
                driver.findElement(burgerMenu).click();
                driver.findElement(profileMenu).click();
                break;
            case CHATS:
                driver.findElement(burgerMenu).click();
                driver.findElement(chatsMenu).click();
                break;
            case SKINS:
                driver.findElement(burgerMenu).click();
                driver.findElement(skinsMenu).click();
                break;
            case EVENTS:
                driver.findElement(burgerMenu).click();
                driver.findElement(eventsMenu).click();
                break;
            case NEWS:
                driver.findElement(burgerMenu).click();
                driver.findElement(newsMenu).click();
                break;
            case EQUALIZER:
                driver.findElement(burgerMenu).click();
                driver.findElement(equalizerMenu).click();
                break;
            case TIMER_ALARM:
                driver.findElement(burgerMenu).click();
                driver.findElement(alarmMenu).click();
                break;
            case INFO:
                driver.findElement(burgerMenu).click();
                driver.findElement(infoMenu).click();
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
        NEWS,
        EQUALIZER,
        TIMER_ALARM,
        INFO
    }
}
