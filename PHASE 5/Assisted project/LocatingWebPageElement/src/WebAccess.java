import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;




/*1. load the driver of the browser
 *2. set the build path with all the jar files,create an object for the webdriver
 *3.maximise the web browser screen
 *4.specify the webpage what u want to test
 *5.access the web components over the webpage
 * */
public class WebAccess {
	public static void main(String[] args) throws InterruptedException {
	//load the driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\OneDrive\\Desktop\\SupportingFile phase 5\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();

	//maximise the web browser screen
		wd.manage().window().maximize();
	//load the webpage
		wd.get("https://www.amazon.in/");
//title of webpage what loaded
		System.out.println(wd.getTitle());
//load the url
		System.out.println(wd.getCurrentUrl());
		
//		//taking value manually
		wd.findElement(By.linkText("Start here.")).click();
		wd.findElement(By.id("ap_customer_name")).sendKeys("Neha");
		wd.findElement(By.id("ap_phone_number")).sendKeys("9845632198");
		wd.findElement(By.id("ap_email")).sendKeys("neha008@gmail.com");
		wd.findElement(By.id("ap_password")).sendKeys("1234567");
		wd.findElement(By.id("continue")).click();
		
		Thread.sleep(20000);

		
		
		//close the browser
		wd.close();
		
		
	
}
}