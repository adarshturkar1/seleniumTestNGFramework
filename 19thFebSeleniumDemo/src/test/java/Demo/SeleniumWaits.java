package Demo;

import java.time.Duration; 
import java.util.List; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.NoSuchElementException; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions; 
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.FluentWait; 
import org.openqa.selenium.support.ui.WebDriverWait; 
 
public class SeleniumWaits { 
 
	public static void main(String[] args) throws InterruptedException { 
 
		 WebDriver driver = new ChromeDriver();  
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
 
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
 
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind"); 
 
 
	 
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10)); 
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='ui-corner-all']"))); 
     
        
		List<WebElement> obj = driver.findElements(By.xpath("//a[@class='ui-corner-all']")); 
 
 
		for (int i = 0; i < obj.size(); i++) { 
 
			if (obj.get(i).getText().equalsIgnoreCase("India")) { 
				// India 
				obj.get(i).click(); 
				break; 
			} 
 
		} 
		 
		//Fluent Wait --- 
		 
		 
		 
		 
		//Fluent wait --- 
		 
		/* 
		 * Fluent Wait Fluent Wait in Selenium is used to define maximum for the web 
		 * driver to wait for a condition, as well as the frequency with which we want 
		 * to check the condition before throwing an "ElementNotVisibleException" 
		 * exception. It checks for the web element at regular intervals until the 
		 * object is found or timeout happens. 
		 */ 
		 
		//30 seconds -max -- 
		 
		// polling time --6 seconds 
		 
	 
 
		 
		  //Declare and initialise a fluent wait 
	 
		  FluentWait wait1 = new FluentWait(driver);  
		 
		  wait1.withTimeout(Duration.ofSeconds(30));     //Specify the timout of the wait  
		 
		  wait1.pollingEvery(Duration.ofSeconds(6));    //Sepcify polling time  
		  
		  wait1.ignoring(NoSuchElementException.class) ; //Specify what exceptions to ignore 
		   
		  //This is how we specify the condition to wait on.  
		 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='usernam']"))); 
 
		  
		 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hii"); 
		 
 
		driver.findElement(By.xpath("//input[@id='Login']")).click(); 
 
		System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText()); // 15 sec 
 
		 
		 
		 
		 
	    
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click(); 
 
	} 
 
}