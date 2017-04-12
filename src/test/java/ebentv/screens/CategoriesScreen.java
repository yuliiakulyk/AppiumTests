package ebentv.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * Created by Yuliia Kulyk on 12.04.2017.
 */
public class CategoriesScreen extends BaseScreen {
    public By category = By.xpath("//android.support.v7.widget.RecyclerView[contains(@resource-id, 'com.aws3.ebentv:id/rv')]/android.widget.RelativeLayout");
    public By categoryTitle = By.id("com.aws3.ebentv:id/tv_category_title");

    public CategoriesScreen(AndroidDriver driver) {
        super(driver);
    }



}
