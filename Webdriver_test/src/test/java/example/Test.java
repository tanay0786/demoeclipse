package example;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Test {
	
  @Test
  public void f() {
	  WebDriver driver =new FirefoxDriver();
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("india");
  }
  @BeforeTest
  public void beforeTest() {
	  
  }

}
