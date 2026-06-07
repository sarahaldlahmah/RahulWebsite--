import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment4 {

	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	public void setUp() {
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));			
	}
	
	@Test
	public void Assignment4_windowsHandles() {
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		
		Set<String> handleofWindows = driver.getWindowHandles();
		Iterator<String> it = handleofWindows.iterator();
	     String parentWindow = it.next();
	     String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		//driver.findElement(By.tagName("h3")).getText();
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		
		driver.switchTo().window(parentWindow);	
        System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		
		
	}

	
}
