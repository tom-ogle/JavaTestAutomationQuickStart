package mycompany.utils;

import static org.testng.Assert.assertTrue;

import mycompany.sites.w3org.commoncomponents.TopNavBar;

public class TopNavBarUtils {

  public static void assertThatTopNavBarIsShowingCorrectly(final TopNavBar topNavBar) {
    assertTrue(topNavBar.isStandardsShowingCorrectly());
    assertTrue(topNavBar.isParticipateShowingCorrectly());
    assertTrue(topNavBar.isMembershipShowingCorrectly());
    assertTrue(topNavBar.isAboutShowingCorrectly());
  }
}
