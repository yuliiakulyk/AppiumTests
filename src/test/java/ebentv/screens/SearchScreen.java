package ebentv.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * Created by Yuliia Kulyk on 12.04.2017.
 */
public class SearchScreen extends BaseScreen {
    public By inputField = By.id("com.aws3.ebentv:id/et_search");
    public By clearButton = By.id("com.aws3.ebentv:id/clear");
    public By backButton = By.id("com.aws3.ebentv:id/back");

    public SearchScreen(AndroidDriver driver) {
        super(driver);
    }

}
