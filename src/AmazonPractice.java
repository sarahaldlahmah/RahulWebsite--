import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonPractice {

	

	WebDriver driver  = new ChromeDriver ();
	
	@BeforeTest
	public void setUp () {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
}
	
	
	
	
	@Test  (priority = 1, enabled = true)
	public void addCucumberOnly () throws InterruptedException {	
	/* String [] itemsneeded = {"Beetroot", "Cucumber"};
	 List <WebElement> allitems = driver.findElements(By.className("product-name"));
	 
	 for (int i =0; i<allitems.size() ; i++) {
		   
		 String itemName = allitems.get(i).getText();
		 String [] nameTrimming = itemName.split(" ");
		 String finalName = nameTrimming[0];
		 
		 System.out.println(finalName);
		 List neededNamesAsList = Arrays.asList(itemsneeded);
		 if (neededNamesAsList.contains(finalName)) {
			 System.out.println(i);
		//	driver.findElements(By.xpath("//button[@type='button']")).get(i).click();		
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();	
			Thread.sleep(10000);
		 } 
	 }*/
	 
	/*	List namesNeeded = Arrays.asList("Cucumber","Beetroot","Mango");
		List <WebElement>allProducts = driver.findElements(By.className("product-name"));
		for (int i =0; i< allProducts.size();i++ ) {
			String productFullName = allProducts.get(i).getText();
			String [] trimmingName = productFullName.split(" ");
			String productNameFinal = trimmingName[0];
			
			if (namesNeeded.contains(productNameFinal))
			{
			//System.out.println(i + productNameFinal);
			driver.findElements(By.xpath("//button[text()= 'ADD TO CART']")).get(i).click();
			String updatedButtonName = 	driver.findElements(By.className("product-action")).get(i).getText();
			System.out.println(updatedButtonName);
			assertTrue(updatedButtonName.contains("ADDED"));
				Thread.sleep(10000);
			}
		}
			*/
	
		//another approach
	List productsNeeded = Arrays.asList("Mango","Beetroot");
    List <WebElement> allProducts = driver.findElements(By.className("product"));
   // List <WebElement> allProducts = driver.findElements(By.className("product"));
    for (int i =0;i<allProducts.size(); i++) {
    	String productfullName = allProducts.get(i).getText();
    	//System.out.println(allProducts.get(i).findElement(By.xpath("//h4[@class='product-name']")).getText());
    	String [] trimmingName = productfullName.split(" "); 
    	String producttype = trimmingName[0];
    	if(productsNeeded.contains(producttype)) {
    		allProducts.get(i).findElement(By.tagName("button")).click();
    	System.out.println(allProducts.get(i).findElement(By.tagName("button")).getText());	
    	Assert.assertTrue(allProducts.get(i).findElement(By.tagName("button")).getText().contains("ADDED"));
    		
    	}
    	
    	
    	
    }
	
		
	
	
	}
	 
		
		
	
	
	
	


}
