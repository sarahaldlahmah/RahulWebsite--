import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class methods2 {

	public static void main(String[] args) {

  		methods2 meth = new methods2();
  		RahulPractice rahul = new RahulPractice();
		
  	meth.getPassword(rahul.driver);
	}
	
	
	
	public void getPassword (WebDriver driver) {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("4558588");
		driver.findElement(By.xpath("//div/button[2]")).click();
		String infoMsg = driver.findElement(By.className("infoMsg")).getText();
		String [] splittedMsg = infoMsg.split(" ");
		String extractedPass = splittedMsg[4].trim();
		String extractedPassfinal  = extractedPass.replace("'", "");
		System.out.println("extractedPass is:" + extractedPassfinal);
		
		
		
	}	

}
