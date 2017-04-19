package ebentv.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * Created by Yuliia Kulyk on 18.04.2017.
 */
public class LogInScreen extends RegistrationBaseScreen {
    public By emailField = By.id("com.aws3.ebentv:id/email");
    public By passwordField = By.id("com.aws3.ebentv:id/password");
    public By showHidePassword = By.id("com.aws3.ebentv:id/text_input_password_toggle");
    public By forgotPassword = By.id("com.aws3.ebentv:id/forgot");
    public By loginButton = By.id("com.aws3.ebentv:id/log_in");
    public By loginFacebook = By.id("com.aws3.ebentv:id/facebook");
    public By errorEmail = By.xpath("//android.widget.LinearLayout[@text='Email']/android.widget.LinearLayout/android.widget.TextView");
    public By errorPassword = By.xpath("//android.widget.LinearLayout[@text='Password']/android.widget.LinearLayout/android.widget.TextView");


    public LogInScreen(AndroidDriver driver) {
        super(driver);
    }
}
