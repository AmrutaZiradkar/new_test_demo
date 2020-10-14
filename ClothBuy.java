package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ClothBuy 
{
	WebDriver driver;
    
	   
	 public ClothBuy(WebDriver driver2) 
	 {
		 driver=driver2;
	}


	public void clothSelection() throws InterruptedException 
	    {
		
		//search product class
			//WebElement womenLink=driver.findElement(By.xpath("//a[class='sf-with-ul']"));
		    //Thread.sleep(5000);
	    	WebElement womenLink=driver.findElement(By.linkText("Women"));   	
	    	womenLink.click();
			
			WebElement topCategory=driver.findElement(By.linkText("Tops"));
			topCategory.click();
			
			WebElement tshirtSelection=driver.findElement(By.linkText("T-shirts"));
			tshirtSelection.click();
			
			WebElement sizeSelect=driver.findElement(By.id("uniform-layered_id_attribute_group_1"));
			sizeSelect.click();
			
			WebElement sortProduct=driver.findElement(By.id("selectProductSort"));
			Select productList=new Select(sortProduct);
			productList.selectByIndex(3);
			
			WebElement topSelect=driver.findElement(By.xpath("//img[@class='replace-2x img-responsive']"));
			//WebElement topSelect=driver.findElement(By.xpath("//div[@class='product-image-containers']"));
           topSelect.click();
          
            WebElement quantitySelect=driver.findElement(By.xpath("//i[@class='icon-plus']"));
            quantitySelect.click();
            
            //WebElement colorSelect=driver.findElement(By.id("color_14"));
            //colorSelect.click();
            
            
            //add to cart seperate class
	    	 WebElement addtoCart=driver.findElement(By.id("add_to_cart"));
            addtoCart.click();
            
            Thread.sleep(5000);
           // WebDriverWait wait=new WebDriverWait(driver, 20);
    	    // wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@title='Proceed to checkout']")));
            
            //payment class
            WebElement proceedtoCheckout=driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
            proceedtoCheckout.click();
            
            Thread.sleep(5000);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
            
            Thread.sleep(2000);
            WebElement proceedtoCheckoutpagetwo=driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
            proceedtoCheckoutpagetwo.click();
            
            WebElement proceedtoCheckoutButton=driver.findElement(By.name("processAddress"));
            proceedtoCheckoutButton.click();
            
            WebElement termsConditions=driver.findElement(By.id("cgv"));
            termsConditions.click();
            
            WebElement proceedtoShipping=driver.findElement(By.name("processCarrier"));
            proceedtoShipping.click();
            
            WebElement paymentMode=driver.findElement(By.xpath("//a[@class='bankwire']"));
            paymentMode.click();
            
            WebElement confirmOrder=driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
            confirmOrder.click();
            Thread.sleep(2000);
            
            
            
		}


	 public void tearown() 
	    {
	    	//driver.quit(); 
		}

}
