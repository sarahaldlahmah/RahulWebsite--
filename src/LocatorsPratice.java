import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorsPratice {
	
	
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); 
	
	
	
	@BeforeTest 
	public void setUp() {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	public void locatorsPractice() throws InterruptedException {
		
		
	//by link text 
	//driver.findElement(By.linkText("Get Shortlisted by Recruiters - Take QA Skill Assessments on TechSmartHire")).click();	
		
//Xpath
//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
//CSS selector			
driver.findElement(By.cssSelector("input[type='checkbox']")).click();
// class name
driver.findElement(By.className("forgot-pwd-container")).click();
//driver.findElement(By.xpath("//form/input [1]")).sendKeys("Sarah");
driver.findElement(By.cssSelector("form input")).sendKeys("SSS");
//Thread.sleep(2000);
wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()= 'Go to Login']")));
driver.findElement(By.xpath("//button[text()= 'Go to Login']")).click();

	
// css selector 
//	tagname.class name 
//  tagname#id
//  tagname[att='value']
// parenttagname childtagname

//Xpath
//parenttagname.childtagname
// //tag[@att='value']






	}
	
	
	

}
