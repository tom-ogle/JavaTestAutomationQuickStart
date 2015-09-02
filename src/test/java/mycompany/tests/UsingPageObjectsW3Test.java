package mycompany.tests;

import mycompany.sites.w3org.pages.HomePage;
import mycompany.sites.w3org.commoncomponents.TopNavBar;
import mycompany.utils.TopNavBarUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UsingPageObjectsW3Test {

  private static final int IMPLICIT_TIMEOUT_SECONDS = 5;

  private WebDriver driver;

  @BeforeTest
  public void setUp() {
    driver = new FirefoxDriver();
    addImplicitTimeouts();
  }

  private void addImplicitTimeouts() {
    driver.manage().timeouts().implicitlyWait(IMPLICIT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
  }

  @Test
  public void headerCheckUsingPageObjects() {
    HomePage w3HomePage = new HomePage(driver, "http://www.w3.org/");
    w3HomePage.loadPage();
    TopNavBar topNavBar = w3HomePage.getTopNavBar();

    TopNavBarUtils.assertThatTopNavBarIsShowingCorrectly(topNavBar);
    topNavBar.clickStandards();
    TopNavBarUtils.assertThatTopNavBarIsShowingCorrectly(topNavBar);
    topNavBar.clickParticipate();
    TopNavBarUtils.assertThatTopNavBarIsShowingCorrectly(topNavBar);
    topNavBar.clickMembership();
    TopNavBarUtils.assertThatTopNavBarIsShowingCorrectly(topNavBar);
    topNavBar.clickAbout();
    TopNavBarUtils.assertThatTopNavBarIsShowingCorrectly(topNavBar);
  }

  @AfterTest
  public void cleanUp() {
    driver.quit();
  }
}
