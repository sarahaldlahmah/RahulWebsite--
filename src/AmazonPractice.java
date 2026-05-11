import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
	 String [] itemsneeded = {"Beetroot", "Cucumber"};
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
		 
		 
		 
	 }
	 
		 
	 }
	 
		
		
	
	
	
	


}
