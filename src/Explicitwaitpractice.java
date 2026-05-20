import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Explicitwaitpractice {

    WebDriver driver;
    WebDriverWait w;

    @BeforeTest
    public void setup() {

        // ✅ All of this must be INSIDE a method
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        w = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1, enabled = true)
    public void login() throws InterruptedException {

        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");
        Select sel = new Select(driver.findElement(By.cssSelector("select.form-control")));
        sel.selectByValue("consult");
        driver.findElement(By.id("terms")).click();
        WebElement userType = driver.findElement(By.className("customradio"));
        driver.findElement(By.cssSelector("input[value='user']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();

        driver.findElement(By.id("signInBtn")).click();
    //    w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-info")));
     //   w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".btn.btn-info")));
        w.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".btn.btn-info"), 4));
        
        Thread.sleep(5000);
        List<WebElement> allproducts = driver.findElements(By.cssSelector(".btn.btn-info"));
        System.out.println(allproducts.size());
        for (int i = 0; i < allproducts.size(); i++) {
            allproducts.get(i).click();
            System.out.println("Clicked" + i);
        }
    }
}