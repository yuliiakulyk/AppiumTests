package ebentv.tests;

/**
 * Created by Yuliia Kulyk on 11.04.2017.
 */

import ebentv.screens.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class NavigationTests extends BaseTest {
    HomeScreen homeScreen;
    String homeScreenTitle = "Home";
    String favoritesScreenTitle = "Favorites";
    String categoriesScreenTitle = "Categories";

    @Before
    public void SetUp() {
        homeScreen = new HomeScreen(driver);
    }

    @Test
    public void test() {
        driver.findElement(homeScreen.favoritesTab).click();
    }

    @Test
    public void transitionToFavoritesScreen() {
        FavoritesScreen screen = homeScreen.navigateToScreen(BaseScreen.Screens.FAVORITES, new FavoritesScreen(driver));
        Assert.assertEquals(favoritesScreenTitle, driver.findElement(screen.screenTitle).getAttribute("text"));
    }

    @Test
    public void transitionToCategoriesScreen() {
        CategoriesScreen screen = homeScreen.navigateToScreen(BaseScreen.Screens.FAVORITES, new CategoriesScreen(driver));
        Assert.assertEquals(categoriesScreenTitle, driver.findElement(screen.screenTitle).getAttribute("text"));
    }

    @Test
    public void transitionToSearchScreen() {
        SearchScreen screen = homeScreen.navigateToScreen(BaseScreen.Screens.SEARCH, new SearchScreen(driver));
        Assert.assertTrue(driver.findElement(screen.inputField).isDisplayed());
    }

    @Test
    public void playPopularVideo() {
        driver.findElement(homeScreen.popularVideo).click();
        sleep();
        homeScreen.clickByCoordinates(800, 1700);
        sleep();
    }

    @Test
    public void swipeTest() {
        sleep();
        driver.swipe(500, 1000, 500, 400, 250);
        sleep();
        java.util.List list = driver.findElements(homeScreen.searchIcon);
        Assert.assertTrue(list.size() < 1);
        Assert.assertTrue(driver.findElement(homeScreen.streamTitle).isDisplayed());
        Assert.assertTrue(driver.findElement(homeScreen.streamIcon).isDisplayed());
    }

}
