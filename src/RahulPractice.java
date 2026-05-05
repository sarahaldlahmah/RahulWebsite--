import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
  
@Test (priority= 8 , enabled = false)
 public void xpathfromasibling () throws InterruptedException {

	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	//driver.navigate().to("https://www.google.com/");
	//driver.navigate().back();
	System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).getText()); 
	
}

@Test (priority = 9, enabled = false)
public void xpathSiblingtoParent () {
	
WebElement buttonsection =  driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]/"));
	
}

@Test (priority = 10, enabled = false)

public void dropdownLists_Currency () throws InterruptedException {
	
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
WebElement staticList = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
Select sel = new Select (staticList);
staticList.click();
Thread.sleep(1000);
sel.selectByIndex(0);
Thread.sleep(1000);
sel.selectByValue("AED");
sel.selectByVisibleText("USD");

}
@Test (priority= 11, enabled = false)
public void dropdownLists_Passengers() {
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.id("divpaxinfo")).click();
//for (int i = 1; i<4; i++) {
//	driver.findElement(By.id("hrefIncAdt")).click();
//
//}
//System.out.println(driver.findElement(By.id("spanAudlt")).getText());
//
int i =1;
while (i<5) {
	driver.findElement(By.id("hrefIncAdt")).click();
    i++;   
}
driver.findElement(By.id("btnclosepaxoption")).click();
System.out.println("no. of adults is : "+driver.findElement(By.id("divpaxinfo")).getText());
assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

	
}

@Test (priority= 12, enabled = false)
public void dropdownLists_FromTo () throws InterruptedException {

driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
//Thread.sleep(2000);
//WebElement fromList = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
//Select sel = new Select(fromList);
//Thread.sleep(2000);
//sel.selectByValue("MAA");
//fromList.findElement(By.xpath("//option[@value='MAA']")).click();
//WebElement toList = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction"));
//toList.findElement(By.xpath("//option[@value='MAA']")).click();

driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
driver.findElement(By.cssSelector("a[value='DEL']")).click();
System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value"));
    // Destination
 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();     
 //driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();  
 WebElement FromList = driver.findElement(By.xpath("//div/div/input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
 FromList.findElement(By.xpath("(//a[@value='HYD'])")).click();
 System.out.println( driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getAttribute("value"));
}

@Test (priority = 13, enabled= false)
public void suggestiveLists_Country () throws InterruptedException {
	
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
driver.findElement(By.id("autosuggest")).sendKeys("ind");
List <WebElement> suggestions =  driver.findElements(By.xpath("//li/a[@class='ui-corner-all']"));
Random rand = new Random();  
int random_index = rand.nextInt(suggestions.size());
if (random_index !=0) {
	
	suggestions.get(random_index).click();

}
else {
	driver.findElement(By.id("autosuggest")).clear();
	driver.findElement(By.id("autosuggest")).sendKeys("British Indian Ocean Territory");
	driver.findElement(By.id("autosuggest")).sendKeys(Keys.ENTER);


}
System.out.println("no is:" + random_index);
Thread.sleep(3000);
//System.out.println(suggestions.get(random_index).getText());


}


@Test (priority = 14, enabled= false)
public void checkBoxes_test () {
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	System.out.println(	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

	boolean istheBoxSelected = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
	assertTrue(istheBoxSelected);
	//assertFalse(istheBoxSelected);
}

@Test (priority = 15, enabled= false)
public void numberOfCheckBoxes() {
	
	List <WebElement> allCheckBoxes =  driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(" no. of checkboxes is: " + allCheckBoxes.size());
	
}

@Test (priority = 16, enabled = false)
public void checkboxesassignment () {
	
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("checkBoxOption1")).click();
	
	assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
	driver.findElement(By.id("checkBoxOption1")).click();
	assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

	
}
@Test (priority = 17, enabled = false)
public void numberofCheckBoxes () {
	List <WebElement> alltheCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println("no of checkboxes is : " + alltheCheckBoxes.size());
	assertEquals(alltheCheckBoxes.size(), 3);
	
}

 @Test (priority = 18, enabled = false)
 public void returnDate () {
	 
	 //assertFalse(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	String attributeStyle =  driver.findElement(By.className("picker-second")).getAttribute("style");
	 assertEquals(attributeStyle, "display: block; opacity: 0.5;");
	 
	 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		String attributeStyle2 =  driver.findElement(By.className("picker-second")).getAttribute("style");

	 assertEquals(attributeStyle2, "display: block; opacity: 1;");
	
 }


@Test (priority = 19, enabled = false)
public void assignment () {
	
	driver.get("https://rahulshettyacademy.com/angularpractice/");
    driver.findElement(By.name("name")).sendKeys("Sarah");
    
    driver.findElement(By.name("email")).sendKeys("sarah.aldlahmah@gmail.com");
    driver.findElement(By.id("exampleInputPassword1")).sendKeys("P@ssw0rd@1234");
    
    
    Select sel = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
    sel.selectByVisibleText("Female");
    
    driver.findElement(By.id("inlineRadio1")).click();
    assertTrue(driver.findElement(By.id("inlineRadio1")).isSelected());
    
	driver.findElement(By.cssSelector(".btn.btn-success")).click();
	
  driver.findElement(By.xpath("//input[@type = 'date']")).sendKeys("05/05/2026");	
  	
	
	String successMsg = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
	//System.out.println(successMsg);
	assertTrue(successMsg.contains("Success! The Form has been submitted successfully!"
			));
	
}


@Test (priority = 20, enabled = true)
public void alerts () throws InterruptedException {
	
	String name = "Sarah";
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("name")).sendKeys(name);
	
	driver.findElement(By.id("alertbtn")).click();
	String alertsText = driver.switchTo().alert().getText();
	assertTrue(alertsText.contains(name));
	driver.switchTo().alert().accept();

	driver.findElement(By.id("confirmbtn")).click();	
	driver.switchTo().alert().dismiss();
	
	
	
	
	
	
}




}
