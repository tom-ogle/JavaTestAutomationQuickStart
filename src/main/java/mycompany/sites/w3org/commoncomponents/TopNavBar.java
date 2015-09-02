package mycompany.sites.w3org.commoncomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopNavBar {

  private static final String STANDARDS_LINK_TEXT = "Standards";
  private static final String PARTICIPATE_LINK_TEXT = "Participate";
  private static final String MEMBERSHIP_LINK_TEXT = "Membership";
  private static final String ABOUT_LINK_TEXT = "About W3C";

  private WebDriver driver;

  public TopNavBar(final WebDriver driver) {
    this.driver = driver;
  }

  public void clickStandards() {
    driver.findElement(By.linkText(STANDARDS_LINK_TEXT)).click();
  }

  public void clickParticipate() {
    driver.findElement(By.linkText(PARTICIPATE_LINK_TEXT)).click();
  }

  public void clickMembership() {
    driver.findElement(By.linkText(MEMBERSHIP_LINK_TEXT)).click();
  }

  public void clickAbout() {
    driver.findElement(By.linkText(ABOUT_LINK_TEXT)).click();
  }

  public boolean isStandardsShowingCorrectly() {
    List<WebElement> standards = driver.findElements(By.linkText(STANDARDS_LINK_TEXT));
    return (standards != null) && (standards.size() >= 1);
  }

  public boolean isParticipateShowingCorrectly() {
    List<WebElement> participate = driver.findElements(By.linkText(PARTICIPATE_LINK_TEXT));
    return (participate != null) && (participate.size() >= 1);

  }

  public boolean isMembershipShowingCorrectly() {
    List<WebElement> membership = driver.findElements(By.linkText(MEMBERSHIP_LINK_TEXT));
    return (membership != null) && (membership.size() >= 1);
  }

  public boolean isAboutShowingCorrectly() {
    List<WebElement> about = driver.findElements(By.linkText(ABOUT_LINK_TEXT));
    return (about != null) && (about.size() >= 1);

  }


}
