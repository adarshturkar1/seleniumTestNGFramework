package Demo;

import java.util.Iterator; 
import java.util.Set; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class tabsHandeling { 
 
	public static void main(String[] args) { 
		 
		 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		 
		driver.findElement(By.xpath("//a[@id='opentab']")).click(); 
	 
		  
	 Set<String> tabs=	driver.getWindowHandles(); 
		                      //p //c 
	  
	 Iterator<String> it = tabs.iterator(); 
	  
	String parentTab= it.next(); 
	String childTab= it.next(); 
 
	 
	 
	driver.switchTo().window(childTab); 
	System.out.println(driver.getCurrentUrl()); 
		 
	driver.switchTo().window(parentTab)	; 
	System.out.println(driver.getCurrentUrl()); 
		 
		 
	 
	} 
}