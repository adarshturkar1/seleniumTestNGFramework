package Demo;

import java.util.Iterator; 
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class nestedTabshandeling { 
 
	
	public static void main(String[] args) throws InterruptedException { 
 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.naukri.com/"); 
		
		// print the current url ---
		System.out.println(driver.getCurrentUrl());
		
		// click on got it popup-- 
		driver.findElement(By.xpath("//span[@class='acceptance-btn-text']")).click(); 
		
		// clcik on mnc-- 
		driver.findElement(By.xpath("(//span[@class='ntc__chip-label'])[2]")).click(); 

		 
		 Set<String> tabs= driver.getWindowHandles(); //p //c 
		  
		 Iterator<String> it = tabs.iterator(); 
		   
		 String parentTab= it.next(); 
		 String childTab= it.next(); 
		  
		 
		// print the currenlt iurl --https://www.naukri.com/mnc-jobs?src=discovery_trendingWdgt_homepage_srch 
		 driver.switchTo().window(childTab); 
		 Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
			
		 
		 
		//(//a[@class='title '])[1].click(); 
		driver.findElement(By.xpath("(//a[@class='title '])[1]")).click(); 
			 
			
		 Set<String> tabs1= driver.getWindowHandles(); // 3tab s 
		  
		 Iterator<String> it1 = tabs1.iterator(); 
		  
		// String parentTab1= it1.next();  
		// String childTab1= it1.next(); 
		 String childTab2= it1.next(); 
		  
		// print the currenlt iurl ----3d tab url-- 
		 driver.switchTo().window(childTab2);
		 System.out.println(driver.getCurrentUrl());
		  
		 //switch to parentTab 
		  //print the current url  
		   
		 driver.switchTo().window(parentTab); 
		System.out.println(driver.getCurrentUrl()); 
 
		
		
	} 
 
}
