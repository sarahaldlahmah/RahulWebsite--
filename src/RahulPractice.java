import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class RahulPractice {

	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new ChromeDriver();
	String loginName = "Sarah";
	methods2 methodsClass = new methods2();
	


	@BeforeTest
	public void setUp() {

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	
	@Test(priority = 2, enabled = false)
	public void Login() throws InterruptedException {
		// driver.findElement(By.id("inputUsername")).sendKeys("Sarah");
		//driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Rahul");
		//driver.findElement(By.cssSelector("input[id*= 'input']")).sendKeys("Rahul");
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys(loginName);
		String correctPass = methodsClass.getPassword(driver);
		
		
		driver.findElement(By.name("inputPassword")).sendKeys(correctPass);
		 Thread.sleep(5000);
		driver.findElement(By.cssSelector(".submit.signInBtn")).click();

		//driver.findElement(By.cssSelector("button.submit.signInBtn")).click();
		// driver.findElement(By.className("signInBtn")).click();
		 Thread.sleep(5000);
		 System.out.println(driver.findElement(By.cssSelector("div p")).getText()); 
		 //Xpath >> //tagname [contains (@attname,staticvalue)]
		 //css tagname [attname* ='static']
	}

	@Test(priority = 3, enabled = false)
	public void incorrectPassandUsernameMsg() {

		// String msg= driver.findElement(By.cssSelector("p[class =
		// 'error']")).getText();
		// System.out.println(msg);

		String msg = driver.findElement(By.cssSelector(".error")).getText();
		System.out.println(msg);

	}

	@Test(priority = 4, enabled = false)
	public void forgotPasswordLink() {
		driver.findElement(By.linkText("Forgot your password?")).click();

	}

	@Test (priority = 5,enabled = false )
	
	public void ForgotPasspage () {
		
		//driver.findElement(By.xpath("//input [@placeholder = 'Name']")).sendKeys("Sarah");
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("4558588");
//		driver.findElement(By.xpath("//input [@type= 'text'] [3]")).sendKeys("000");
//        driver.findElement(By.className("go-to-login-btn")).click();
//		driver.findElement(By.xpath("//input[@placeholder ='Phone Number']")).sendKeys("088155887");
//		driver.findElement(By.cssSelector("input[placeholder ='Phone Number']")).clear();
	//driver.findElement(By.className("reset-pwd-btn")).click();
	//driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	//driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	//driver.findElement(By.cssSelector("button[class = 'reset-pwd-btn']")).click();
	//driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
	driver.findElement(By.xpath("//div/button[2]")).click();
	String infoMsg = driver.findElement(By.className("infoMsg")).getText();
	//System.out.println(infoMsg);
		
	
}
	
	@Test (priority = 6, enabled= false) 
	public void  PageAfterLogin ( ) throws InterruptedException {
		
	String expectedsuccessfulLoginMsg = "You are successfully logged in.";
	Thread.sleep(3000);
	String successfulLoginMsg= driver.findElement(By.cssSelector("div p")).getText();
	Assert.assertEquals(successfulLoginMsg, expectedsuccessfulLoginMsg);
	
		
	}
	
  @Test (priority = 7, enabled= false )
  public void checkTheLoginName () {
	  
	  String HelloMsg = driver.findElement(By.cssSelector("div h2 ")).getText();
//     String []Msgsplitted = HelloMsg.split(" ");
//      String[] NameAlone = Msgsplitted [1].split(",");
//      String NameonthePage= NameAlone[0].trim();
//      System.out.println("Name is  :"+NameonthePage);
//      assertEquals(NameonthePage, loginName);
      
      String ExpectedMSG = "Hello "+loginName+",";
	  Assert.assertEquals(HelloMsg, ExpectedMSG);
	  	   }
  
	
@Test (priority = 8, enabled =  false)
public void logoutButton () {
	driver.findElement(By.xpath("//button [text() = 'Log Out']")).click();
	
}
  
@Test (priority= 8 , enabled = true)
 public void xpathfromasibling () throws InterruptedException {

	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	//driver.navigate().to("https://www.google.com/");
	//driver.navigate().back();
	System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).getText()); 
	
}

@Test (priority = 9, enabled = true)
public void xpathSiblingtoParent () {
	
WebElement buttonsection =  driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]/"));
	
}


	
}
