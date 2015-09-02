package mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Library {

  public static void headerCheck(final WebDriver driver) {
    driver.findElement(By.linkText("Standards")).click();
    driver.findElement(By.linkText("Participate")).click();
    driver.findElement(By.linkText("Membership")).click();
    driver.findElement(By.linkText("About W3C")).click();
  }
}
