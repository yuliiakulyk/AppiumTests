package ebentv.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * Created by Yuliia Kulyk on 12.04.2017.
 */
public class FavoritesScreen extends BaseScreen {

    public By videoAction = By.id("com.aws3.ebentv:id/iv_video_action");
    public By videoCommentsNumber = By.id("com.aws3.ebentv:id/tv_comments");
    public By videoRating = By.id("com.aws3.ebentv:id/tv_rating");
    public By videoTitle = By.id("com.aws3.ebentv:id/tv_title");
    public By videoActionAddToFavorites = By.id("com.aws3.ebentv:id/add_to_favorite");
    public By videoActionShare = By.id("com.aws3.ebentv:id/share");
    public By noFavoritesYetText = By.xpath("android.widget.TextView[contains(@text,'No favorites yet.')]");
    public By noFavoritesPicture = By.id("com.aws3.ebentv:id/ivNoFavorites");

    public FavoritesScreen(AndroidDriver driver) {
        super(driver);
    }

}
