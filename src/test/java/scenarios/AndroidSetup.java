package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Yuliia Kulyk on 29.01.2017.
 */
public class AndroidSetup {
    public AndroidDriver driver;

    public void prepareAndroidForAppium() throws MalformedURLException {
        File appDir = new File("apps");
        File app = new File (appDir, "Eben Radio_com.aws3.ebenradio.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", "android");

        capabilities.setCapability("deviceName", "Android");
        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
