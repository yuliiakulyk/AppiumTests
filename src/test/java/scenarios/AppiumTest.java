package scenarios;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yuliia Kulyk on 29.01.2017.
 */
public class AppiumTest extends AndroidSetup {

    @Test
    public void test() {
        try {
            prepareAndroidForAppium();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        String app_package_name = "com.aws3.ebenradio:id/";
        By playButton = By.id(app_package_name + "play");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(playButton).click();
    }
}
