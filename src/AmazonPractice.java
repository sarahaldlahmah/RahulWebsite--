import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonPractice {

	

	WebDriver driver  = new ChromeDriver ();
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
	
	
	@BeforeTest
	public void setUp () {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
	
	@Test  (priority = 1, enabled = true)
	public void addCucumber () throws InterruptedException {	
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
    }}
    
	
 @Test (priority =2, enabled = false, invocationCount = 1 )
     public void addtoCart() throws InterruptedException {
	 // to add random products to the cart
	 List <WebElement> allProducts = driver.findElements(By.className("product"));
	 Random rand = new Random();
	 
	 for (int i = 0; i< 5;i++ ) {
		 int randomIndex = rand.nextInt(allProducts.size()-1);
		 System.out.println(randomIndex);
		// allProducts.get(randomIndex).findElement(By.tagName("button")).click();
		 driver.findElements(By.xpath("//button[text()= 'ADD TO CART']")).get(randomIndex).click();
	Thread.sleep(10000);
		 
	 }
 }
	 
	 
@Test (priority =3, enabled = true)
public void checkout() {
	
	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	driver.findElement(By.xpath("//button[text ()='PROCEED TO CHECKOUT']")).click();
	w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("promoCode")));
	driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.className("promoBtn")).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
	String ifCodeApplied = driver.findElement(By.className("promoInfo")).getText();
	assertTrue(ifCodeApplied.contentEquals("Code applied ..!"));
	
    
	 
	 
 }   
	
	
	
	
	 
		
		
	
	
	
	


}
