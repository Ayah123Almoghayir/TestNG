import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Check {
@Test
 public static void main(String[] args) {
  //Creating webdriver instance
  WebDriver driver= new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  //Open web application
  driver.get("https://elenastepuro.github.io/test_env/index.html");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  //Enter data into textboxes
  driver.findElement(By.id("change_id")).sendKeys("test_id");
  driver.findElement(By.id("change_className")).sendKeys("test_class");
  driver.findElement(By.id("Submit")).click();
  //driver.findElement(By.id("change_id")).sendKeys("updated_test_id");
  //driver.findElement(By.id("change_className")).sendKeys("updated_test_class");
 }

}