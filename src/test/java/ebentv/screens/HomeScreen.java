package ebentv.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * Created by Yuliia Kulyk on 11.04.2017.
 */
public class HomeScreen extends BaseScreen {
    public By streamTitle = By.id("com.aws3.ebentv:id/tv_stream_title");
    public By popularVideosTextView = By.xpath("//android.support.v7.widget.RecyclerView[contains(@resource-id,'rv_home')]/android.widget.LinearLayout[2]/android.widget.TextView");
    public By popularVideoTitle = By.id("com.aws3.ebentv:id/tv_video_title");
    public By popularVideoAction = By.id("com.aws3.ebentv:id/iv_video_action");
    public By popularVideoRate = By.id("com.aws3.ebentv:id/tv_video_rate");
    public By popularVideoAddToFavorites = By.id("com.aws3.ebentv:id/add_to_favorite");
    public By popularVideoShare = By.id("com.aws3.ebentv:id/share");
    public By videoThumbnail = By.xpath("//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.ImageView");

    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

}
