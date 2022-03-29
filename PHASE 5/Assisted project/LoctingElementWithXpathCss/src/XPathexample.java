import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class XPathexample {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\OneDrive\\Desktop\\SupportingFile phase 5\\chromedriver_win32 (1)\\chromedriver.exe"); // Provide the path to your chrome driver. Make sure your chrome driver version is updated.
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://login.yahoo.com/account/create");
driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Your-Name"); // Will send values to First Name tab
driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("Your-Last_name"); //xpath for last name box
driver.findElement(By.xpath("//input[@id='usernamereg-yid']")).sendKeys("email@yahoo.com"); //xpath for email box
driver.findElement(By.xpath("//input[@id='usernamereg-phone']")).sendKeys("123456789"); //xpath for phone number box
driver.findElement(By.xpath("//select[@id='usernamereg-month']")).click(); //xpath for usermonth box
driver.findElement(By.xpath("//input[@id='usernamereg-day']")).sendKeys("01"); //xpath for userday box
driver.findElement(By.xpath("//input[@id='usernamereg-year']")).sendKeys("1999");// xpath for user year
driver.findElement(By.xpath("//button[@id='reg-submit-button']")).click();// xpath for submit button
}
}