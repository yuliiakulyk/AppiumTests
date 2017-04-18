package ebentv.tests;

import ebentv.screens.BaseScreen;
import ebentv.screens.HomeScreen;
import ebentv.screens.SearchScreen;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Yuliia Kulyk on 18.04.2017.
 */
public class SearchTests extends BaseTest {
    HomeScreen homeScreen;
    SearchScreen searchScreen;

    @Before
    public void SetUp() {
        homeScreen = new HomeScreen(driver);
        searchScreen = homeScreen.navigateToScreen(BaseScreen.Screens.SEARCH, new SearchScreen(driver));
    }

    @Test
    public void searchTest() {
        SearchScreen searchScreen = homeScreen.navigateToScreen(BaseScreen.Screens.SEARCH, new SearchScreen(driver));
        searchScreen.searchFor("50 cent");
        sleep();
        searchScreen.assertSearchResultsContain("50 cent");
    }

}
