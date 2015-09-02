package mycompany.sites.w3org.pages;

import mycompany.sites.w3org.commoncomponents.TopNavBar;
import org.openqa.selenium.WebDriver;

public class HomePage {

  private final WebDriver driver;
  private final String url;

  public HomePage(final WebDriver driver, final String url) {
    this.driver = driver;
    this.url = url;
  }

  public void loadPage() {
    driver.get(url);
  }

  public TopNavBar getTopNavBar() {
    return new TopNavBar(driver);
  }
}
