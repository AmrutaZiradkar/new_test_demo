package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase
{
	
	//@Before Tes
	//setclass
	//sign
	
	//@After Test
	//TearDown
	
	//@Test
	//call all remaining classed
	//regist
	//search
	//add to cart
	//payment
	
	
	
		public static void main(String args[]) throws InterruptedException
		{
		TestCase shoppingtest= new TestCase();
		shoppingtest.setup();
		shoppingtest.SignIn();
		
		Registration re= new Registration(driver);
		re.registartion();
		
		ClothBuy co= new ClothBuy(driver);
				co.clothSelection();
		shoppingtest.tearown();
			
		}
		
	    static WebDriver driver;
	    
	    //setup class
	    public void setup() 
	    {
	    	
	    	
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakesh\\Desktop\\Chrome_Selenium\\84\\chromedriver.exe");
	    	driver=new ChromeDriver();
	    	
	    	
	    	driver.navigate().to("http://automationpractice.com/index.php");
	    	driver.manage().window().maximize();
	    }
	    
	    //sign in class
	    public void SignIn() 
	    {
			
	    	WebElement signButton=driver.findElement(By.xpath("//a[@class='login']"));
			signButton.click();
			WebElement emailId=driver.findElement(By.id("email_create"));
			emailId.sendKeys("suwarnaungari@gmail.com");
			WebElement createAccount=driver.findElement(By.id("SubmitCreate"));
			createAccount.click();
		}
	    
	    public void tearown() 
	    {
	    	driver.quit(); 
		}
	

}
