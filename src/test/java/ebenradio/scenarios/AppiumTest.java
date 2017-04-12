package ebenradio.scenarios;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import ebenradio.screens.BaseScreen;
import ebenradio.screens.InfoScreen;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yuliia Kulyk on 29.01.2017.
 */
@RunWith(JUnitParamsRunner.class)
public class AppiumTest extends BaseTest {

    /*@Before
    public void openInfoScreen() {
        BaseScreen screen = new BaseScreen(driver);
        screen.navigateToMenu(BaseScreen.MenuOptions.INFO);
    }*/

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

    //@FileParameters(value = "C:\\Users\\DELL\\IdeaProjects\\AppiumTests\\src\\test\\testdata\\testInfoForm.csv", mapper = CsvWithHeaderMapper.class)
    @Test
    @FileParameters(value = "src\\test\\testdata\\testInfoForm.csv", mapper = CsvWithHeaderMapper.class)
    public void sendContactForm(String name, String email, String message) {
        BaseScreen screen = new BaseScreen(driver);
        screen.navigateToMenu(BaseScreen.MenuOptions.INFO);
        InfoScreen infoScreen = new InfoScreen(driver);
        infoScreen.fillAllFieldsSubmit(name, email, message);
    }

}
