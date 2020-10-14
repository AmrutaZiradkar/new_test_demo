package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Methods 
{
   static WebDriver driver;
   
   
	public Methods(WebDriver driver) 
	{
	this.driver=driver;	
	}
	
	public static void signUp() throws Exception
	{
			
			driver.findElement(By.id("username")).sendKeys("jwamruta");
			driver.findElement(By.id("password")).sendKeys("12345");
			driver.findElement(By.id("Login")).click();

	}
	
	public static void launch_browser()
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Desktop\\Chrome_Selenium\\84\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
        driver.manage().window().maximize();
 
	}
}
