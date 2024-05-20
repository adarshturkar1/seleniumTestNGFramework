package Demo;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class AlertHandeling { 
	 
	public static void main(String[] args) throws InterruptedException { 
		 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
         
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click(); 
		 
 
		 System.out.println( driver.switchTo().alert().getText()); 
		 
	     Thread.sleep(2000); 
		 
		//driver.switchTo().alert().accept(); 
	 
		  driver.switchTo().alert().dismiss(); 
		   
	//	  driver.switchTo().alert().sendKeys("hii"); 
		  
		 
		 
	} 
	 
 
}