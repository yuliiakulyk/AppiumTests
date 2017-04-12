package ebenradio.scenarios;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yuliia Kulyk on 29.01.2017.
 */
public class BaseTest {
    public static Process process;
    public AndroidDriver driver;
    //Process process;
    public static String nodePath = "\"C:\\Program Files (x86)\\Appium\\node.exe\"";
    public static String appiumJSPath = "\"C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js\"";
    public static String[] cmd = {nodePath, " ", appiumJSPath};


    @BeforeClass
    public static void appiumStart() throws IOException, InterruptedException {
        process = Runtime.getRuntime().exec(cmd);
        Thread.sleep(20000);
        if (process != null) {
            System.out.println("Appium server is started now");
        }
    }


    @Before
    public void prepareAndroidForAppium() throws IOException, InterruptedException {
        File appDir = new File("apps");
        File app = new File (appDir, "Eben_Radio_com.aws3.ebenradio.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", "android");

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @AfterClass
    public static void appiumStop() {
        if (process != null) {
            process.destroy();
        }
    }

}
