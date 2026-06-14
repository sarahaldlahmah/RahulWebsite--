import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FramesAssignment {

	
	
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	public void setup() {
		
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
	}
	
	@Test
	public void framesAssignment() {
		
		List<WebElement> allFrames=  driver.findElements(By.tagName("frame"));
		
		WebElement topFrame = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(topFrame);
		
		// in the top frame 
		//left
		WebElement left = driver.findElement(By.name("frame-left"));
		driver.switchTo().frame(left);
	    String leftText = driver.findElement(By.tagName("body")).getText();
	    System.out.println(leftText);
	    
	    //middle
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(topFrame);
		WebElement middle = driver.findElement(By.name("frame-middle"));
		driver.switchTo().frame(middle);
		String midText = driver.findElement(By.tagName("body")).getText();
	    System.out.println(midText);
	    
	    //right
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(topFrame);
		WebElement right = driver.findElement(By.name("frame-right"));
		driver.switchTo().frame(right);
		String righttext = driver.findElement(By.tagName("body")).getText();
	    System.out.println(righttext);
	    
	    //bottom
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(driver.findElement(By.name("frame-bottom")));
	    System.out.println(driver.findElement(By.tagName("body")).getText());   
	    

		
		
		
		
	}
	
	
	
	
	
	
	
	
}
