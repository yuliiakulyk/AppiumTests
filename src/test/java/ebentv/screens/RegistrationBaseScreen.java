package ebentv.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * Created by Yuliia Kulyk on 18.04.2017.
 */
public class RegistrationBaseScreen extends BaseScreen {
    public By logInTab = By.xpath("//android.widget.LinearLayout/android.widget.TextView[contains(@text,'LOG IN')]");
    public By signUpTab = By.xpath("//android.widget.LinearLayout/android.widget.TextView[contains(@text,'SIGN UP')]");
    public By closeForm = By.id("com.aws3.ebentv:id/close");

    public RegistrationBaseScreen(AndroidDriver driver) {
        super(driver);
    }

}
