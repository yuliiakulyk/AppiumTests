package scenarios;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import screens.BaseScreen;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yuliia Kulyk on 29.01.2017.
 */
public class AppiumTest extends BaseTest {

    @Test
    public void test() {
        By playButton = By.id("play");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(playButton).click();
    }

    @Test
    public void navigateToMusicMenu() {
        BaseScreen screen = new BaseScreen(driver);
        screen.navigateToMenu(BaseScreen.MenuOptions.PROFILE);
    }
}
