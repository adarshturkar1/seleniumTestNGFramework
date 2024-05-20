package Demo;

import java.util.Iterator; 
import java.util.Set; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class windowsHandeling { 
 
	public static void main(String[] args) { 
		 
		 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		 
		driver.findElement(By.xpath("//button[@id='openwindow']")).click(); 
	 
		  
	 Set<String> windows=	driver.getWindowHandles(); 
		                      //p //c 
	  
	 Iterator<String> it = windows.iterator(); 
	  
	String parentWindow= it.next(); 
	String childWindow= it.next(); 
 
	 
	 
	driver.switchTo().window(childWindow); 
	System.out.println(driver.getCurrentUrl()); 
		 
	driver.switchTo().window(parentWindow)	; 
	System.out.println(driver.getCurrentUrl()); 
		 
		 
		 
 
		 
	} 
}