package ebentv.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * Created by Yuliia Kulyk on 18.04.2017.
 */
public class SignUpScreen extends RegistrationBaseScreen {
    public By nameField = By.id("com.aws3.ebentv:id/name");
    public By emailField = By.id("com.aws3.ebentv:id/email");
    public By genderDropdown = By.id("com.aws3.ebentv:id/spinner_gender");
    public By birthday = By.id("com.aws3.ebentv:id/birthday");
    public By passwordField = By.id("com.aws3.ebentv:id/password");
    public By showHidePassword = By.id("com.aws3.ebentv:id/text_input_password_toggle");
    public By sighUpButton = By.id("com.aws3.ebentv:id/sign_up");
    public By nameError = By.xpath("//android.widget.LinearLayout[@text='Name']/android.widget.LinearLayout/android.widget.TextView");
    public By emailError = By.xpath("//android.widget.LinearLayout[@text='Email']/android.widget.LinearLayout/android.widget.TextView");
    public By passwordError = By.xpath("//android.widget.LinearLayout[@text='Password']/android.widget.LinearLayout/android.widget.TextView");

    /*-----------------ERROR MESSAGES----------------------*/
    public String nameLength = "Min 2 characters";

    public SignUpScreen(AndroidDriver driver) {
        super(driver);
    }

}
