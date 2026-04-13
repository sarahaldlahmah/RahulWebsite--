import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RahulPractice {

	
	WebDriver driver = new ChromeDriver ();
	
	
	@BeforeTest 
	public void setUp () {
		
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}
	
	
	@Test (priority = 1)
	public void Login () {
	 driver.findElement(By.id("inputUsername")).sendKeys("Sarah");	
	 driver.findElement(By.name("inputPassword")).sendKeys("Sarah");
	 driver.findElement(By.className("signInBtn")).click();
	}
	
	@Test  (priority = 2)
	public void incorrectPassandUsernameMsg () {
		
		String theErrorText = driver.findElement(By.cssSelector(".error")).getText();
		System.out.println(theErrorText);
				
	}
	
	@Test (priority = 3) 
	public void forgotPasswordLink () {
		driver.findElement(By.linkText("Forgot your password?")).click();
		
	}
	
	@Test (priority = 4)
	
	public void ForgotPasspage () {
		
		driver.findElement(By.xpath("//input [@placeholder = 'Name']")).sendKeys("Sarah");
		driver.findElement(By.xpath("//input [@placeholder = 'Email']")).sendKeys("Sarah@gmail.com");
		//driver.findElement(By.xpath("//input [@placeholder= 'Email']")).clear();
		driver.findElement(By.xpath("//input [@type= 'text'] [3]")).sendKeys("000");
      //  driver.findElement(By.className("go-to-login-btn")).click();
		}
	
	
	
	
	
	



}
