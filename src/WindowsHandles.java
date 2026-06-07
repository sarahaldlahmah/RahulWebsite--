import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowsHandles {
	
	
	WebDriver driver = new ChromeDriver();
	Actions a = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
    
	
	
	
	
	@BeforeTest
	public void setUp() {
	
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();	
		
	}
	
	
@Test 
public void windowHandlingDemo () {
//	driver.findElement(By.linkText("Get Shortlisted by Recruiters - Take QA Skill Assessments on TechSmartHire")).click();
//    Set <String> dd=  driver.getWindowHandles();
//    Iterator<String> r=  dd.iterator();
//    String parentHandle=  r.next();
//    String childHandle = r.next();
//	driver.findElement(By.xpath("//a[@href='/authentication']")).click();
//	a.moveToElement(driver.findElement(By.xpath("//a[@href='/authentication']"))).click().build().perform();
	   
	 driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();


 Set<String> windowsNames = driver.getWindowHandles();	
 Iterator<String> itnames = windowsNames.iterator();
 String parentWindow = itnames.next();
 String childWindow = itnames.next();	
 driver.switchTo().window(childWindow);

 String emailName = driver.findElement(By.linkText("mentor@rahulshettyacademy.com")).getText();	
  System.out.println(emailName);
  
  driver.switchTo().window(parentWindow);
  driver.findElement(By.id("username")).sendKeys(emailName);
	
// trying split method 
  
  
   
   
	
	
}
	

}
