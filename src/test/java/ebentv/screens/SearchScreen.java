package ebentv.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Yuliia Kulyk on 12.04.2017.
 */
public class SearchScreen extends BaseScreen {
    public By inputField = By.id("com.aws3.ebentv:id/et_search");
    public By clearButton = By.id("com.aws3.ebentv:id/clear");
    public By backButton = By.id("com.aws3.ebentv:id/back");
    public By videoTitle = By.id("com.aws3.ebentv:id/tv_title");

    public SearchScreen(AndroidDriver driver) {
        super(driver);
    }

    public void searchFor(String searchQuery) {
        WebElement field = driver.findElement(inputField);
        field.clear();
        field.sendKeys(searchQuery);
        driver.pressKeyCode(AndroidKeyCode.ENTER);
    }

    public void assertSearchResultsContain(String query) {
        List<WebElement> searchResults = driver.findElements(videoTitle);
        for (int i = 0; i < searchResults.size(); i++) {
            Assert.assertTrue(searchResults.get(i).getAttribute("text").toLowerCase().contains(query.toLowerCase()));
        }
    }

}
