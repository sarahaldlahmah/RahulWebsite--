import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;



public class ActionDemo {

 WebDriver driver = new ChromeDriver();
 Actions a = new Actions(driver);
 

 
 
 
 
 @BeforeTest 
 public void mySetup() {
 	 
	 driver.get("https://www.amazon.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 
 }
 
 
 @Test
 public void actions() {
	//  a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	 a.moveToElement(driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-accountList']"))).build().perform();
     a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
     a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().build().perform();
	// a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
     
     driver.get("https://demoqa.com/droppable");
     driver.findElement(By.id("draggable")).click();
     WebElement S1 = driver.findElement(By.id("draggable"));
     WebElement S2 = driver.findElement(By.id("droppable"));
     a.dragAndDrop(S1, S2).build().perform();
	 
	 
 }
 
 
 
 
}
