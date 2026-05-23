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

public class FluentWit {

	
	WebDriver driver = new ChromeDriver();
	
	
@BeforeTest
public void setUp() {
	
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	
}

@Test
public void isHellodisplayed () {
	
	
 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(null));
	driver.findElement(By.tagName("button")).click();
	
	Wait <WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(3))
			.ignoring(NoSuchElementException.class);
	
WebElement element = wait.until( new Function<WebDriver, WebElement>() {
		
		public WebElement apply(WebDriver driver) {
			 if (driver.findElement(By.id("finish")).isDisplayed())
			 {    System.out.println(driver.findElement(By.id("finish")).getText());
				 return driver.findElement(By.id("finish"));
				 
			 }
			 else 
				 return null;
			
			
		}
		
	});
	


}
}