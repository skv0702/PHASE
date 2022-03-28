package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {

WebDriver driver;
	
    @BeforeMethod
    public void setUp() {
    	driver = new ChromeDriver();
    	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.get("https://www.amazon.in/");    	
 
    }
    
    @Test(priority=1)
    public void clickOnSearch() {
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
    	WebElement wd=driver.findElement(By.id("nav-search-submit-button"));
    	wd.click();

    	
    	
    }
    
    
    
      
}
