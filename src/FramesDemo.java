import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FramesDemo {

 WebDriver driver= new ChromeDriver();
 
 
 
 @BeforeTest 
 public void mySetup() {
	 
	 driver.get("https://demoqa.com/frames");
     driver.manage().window().maximize();	 
 }
 
	
 @Test
 public void framesdemo () {
	 
	List <WebElement> allFrames =  driver.findElements(By.tagName("iframe"));
	System.out.println(allFrames.size());
	//driver.switchTo().frame(driver.findElement(By.id("frame1")));
	 
	 driver.switchTo().frame(0);
	String sss = driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(sss);
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(1);
	System.out.println(driver.findElement(By.id("sampleHeading")).getText());
	
	
	
	 
	 
 }
 
 
	
}
