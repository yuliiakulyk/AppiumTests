package ebentv.tests;

import ebentv.screens.BaseScreen;
import ebentv.screens.HomeScreen;
import ebentv.screens.SignUpScreen;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yuliia Kulyk on 25.04.2017.
 */
@RunWith(JUnitParamsRunner.class)
public class RegistrationTests extends BaseTest {
    HomeScreen homeScreen;
    SignUpScreen signUpScreen;

    @Before
    public void setUp() {
        homeScreen = new HomeScreen(driver);
        signUpScreen = homeScreen.navigateToScreen(BaseScreen.Screens.SIGNUP, new SignUpScreen(driver));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    @FileParameters(value = "", mapper = CsvWithHeaderMapper.class)
    public void testRequiredFields (String name, String email, String password, boolean shouldPass) {
        signUpScreen.fillRequiredFields(name, email, password);
        driver.findElement(signUpScreen.sighUpButton).click();
        //Assertion
    }

}
