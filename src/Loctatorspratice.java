import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loctatorspratice {

	
WebDriver driver = new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(3))
.ignoring(NoSuchElementException.class);







@BeforeTest 
public void setup() {
	
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	
		
}

@Test 
public void locatorsPratice() {
	// id
	//driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
	
	//Css selector
	
	
WebElement dd= 	wait2.until(new Function<WebDriver, WebElement>() {
		
		public WebElement apply(WebDriver driver) {
			
			if (driver.findElement(By.id("")).isDisplayed())
				return driver.findElement(By.id(""));
			else
				return null;
		}
		
	});
	driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Sarsh");
		
	
	
	//name
	driver.findElement(By.name("inputPassword")).sendKeys("123");
	
	//Class name
	//driver.findElement(By.className("signInBtn")).click();
	
	//Xpath 
	//driver.findElement(By.xpath("//button[@type ='submit']")).click();
	
	//Css selector
	//driver.findElement(By.cssSelector("button[type ='submit']")).click();
	
	//Css selector
	driver.findElement(By.cssSelector(".submit.signInBtn")).click();
	
	//
	
	
	
}




	
}
