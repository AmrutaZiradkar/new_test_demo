package Amazon;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration
{
	
	 WebDriver driver;
		
		public Registration(WebDriver driver2) {
			driver=driver2;
		}

		public void registartion() throws InterruptedException 
	    {
	    	
	    	System.out.println("PRESONAL INFORMATION");
	    	Thread.sleep(5000);
			WebElement radioGener=driver.findElement(By.name("id_gender"));
			radioGener.click();
			WebElement firstName=driver.findElement(By.name("customer_firstname"));
			firstName.sendKeys("suwarna");
			Thread.sleep(5000);
			WebElement lastName=driver.findElement(By.id("customer_lastname"));
			lastName.clear();
			lastName.sendKeys("Patil");
			Thread.sleep(5000);
			WebElement email=driver.findElement(By.id("email"));
			email.clear();
			Random rand = new Random();

			int  n = rand.nextInt(50) + 1;
			email.sendKeys("patil"+n+"@gmail.com");
			Thread.sleep(5000);
			WebElement setPasswod=driver.findElement(By.id("passwd"));
			setPasswod.sendKeys("suwarna911");
			Thread.sleep(5000);
			System.out.println("This is For DOB");
			WebElement days =driver.findElement(By.id("days"));
			//days.sendKeys("4");
			//For that use select class
			Select dropdays= new Select(days);
			dropdays.selectByIndex(4);
			
			WebElement months=driver.findElement(By.id("months"));
			Select dropmonths=new Select(months);
			dropmonths.selectByIndex(11);
			
			WebElement years=driver.findElement(By.id("years"));
			Select dropyears=new Select(years);
			dropyears.selectByIndex(11);
			
			WebElement newLetterCheckBox=driver.findElement(By.id("uniform-newsletter"));
			newLetterCheckBox.click();
			Thread.sleep(5000);
			WebElement specialOfferCheckBox=driver.findElement(By.id("optin"));
			specialOfferCheckBox.click();
			Thread.sleep(5000);
			
			
			System.out.println("ADDRESS INFORMATION");
			
			WebElement comanyName=driver.findElement(By.id("company"));
			comanyName.sendKeys("Indus health plus pvt ltd");
			
			WebElement addressLine1=driver.findElement(By.id("address1"));
			addressLine1.sendKeys("hingane home colony");
			
			WebElement addressLine2=driver.findElement(By.id("address2"));
			addressLine2.sendKeys("karve nagar");

			WebElement cityName=driver.findElement(By.id("city"));
			cityName.sendKeys("Pune");
			
			WebElement stateSelect =driver.findElement(By.id("id_state"));
			Select dropState=new Select(stateSelect);
			dropState.selectByIndex(10);
			
			WebElement pinCode=driver.findElement(By.id("postcode"));
			pinCode.sendKeys("67578");
			
		
			WebElement countrySelect =driver.findElement(By.id("id_country"));
			Select dropCountry=new Select(countrySelect);
			dropCountry.selectByIndex(1);
			
			WebElement otherInfo=driver.findElement(By.id("other"));
			otherInfo.sendKeys("Wecome to worl of online shopping");
			
			WebElement phoneNumber=driver.findElement(By.id("phone"));
			phoneNumber.sendKeys("99786423415");
			
			WebElement mobileNumber=driver.findElement(By.id("phone_mobile"));
			mobileNumber.sendKeys("7734568790");
			
			WebElement myaddress=driver.findElement(By.id("alias"));
			myaddress.sendKeys("wani yawatmal");
			
			WebElement registerAccount=driver.findElement(By.id("submitAccount"));
			registerAccount.click();
			
			}

}
