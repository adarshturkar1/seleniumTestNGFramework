package Demo;

import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class ScrollingDemo { 
	 
	public static void main(String[] args) { 
		 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		 
		 
		WebElement a=driver.findElement(By.xpath("//a[text()='REST API']")); 
		 
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		 
		js.executeScript("arguments[0].scrollIntoView()", a); 
		 
		//a.click(); 
 
		 
		 
		 
		 
		 
		 
	} 
 
}