package Demo;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class StaleElementReferenceExcpetion { 
 
	public static void main(String[] args) { 
		 
		 
		 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://login.salesforce.com/"); 
 
		WebElement a = driver.findElement(By.id("username")); 
		a.sendKeys("test1"); 
 
		WebElement b = driver.findElement(By.name("pw")); 
		b.sendKeys("test123"); 
 
		driver.navigate().refresh(); 
		 
		 
		try { 
		a.sendKeys("test1");  //stale element 
		} 
		catch(Exception e) { 
		         a=driver.findElement(By.id("username")); 
		         a.sendKeys("test1"); 
		} 
		 
	} 
	 
	 
	 
	 
	 
}