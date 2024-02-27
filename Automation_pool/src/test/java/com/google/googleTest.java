package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleTest {
  
  @BeforeTest
  public void beforeTest() {
	  
  }
  @Test
  public void f() {
	 /*System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  WebDriver driver1 = new ChromeDriver();
	  driver1.get("https://www.google.com.mx/");
	  driver1.manage().window().maximize();*/
	 System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/firefox/geckodriver.exe");
	  WebDriver driver = (WebDriver) new FirefoxDriver();
	  driver.get("https://www.google.com.mx/");
	  driver.manage().window().maximize();
	  driver.close();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
