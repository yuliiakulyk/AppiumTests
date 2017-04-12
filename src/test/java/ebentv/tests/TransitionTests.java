package ebentv.tests;

/**
 * Created by Yuliia Kulyk on 11.04.2017.
 */

import ebentv.screens.BaseScreen;
import ebentv.screens.CategoriesScreen;
import ebentv.screens.FavoritesScreen;
import ebentv.screens.HomeScreen;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TransitionTests extends BaseTest{
    HomeScreen homeScreen;
    String homeScreenTitle = "Home";
    String favoritesScreenTitle = "Favorites";
    String categoriesScreenTitle = "Favorites";

    @Before
    public void SetUp(){
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

}
