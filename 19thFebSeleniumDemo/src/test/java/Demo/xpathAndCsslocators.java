package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAndCsslocators {
	
	public static void main(String[] args) { 
		
		
		WebDriver driver=new ChromeDriver(); 
		 
		driver.get("https://login.salesforce.com/?locale=in"); 
	
		
	
		// 1 normal xpath -   //tagname[@atrribute='value'] 
		
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Hello");
		
		
		
		// 2 parent to child xpath -    //parentXpath/childTagname 
		
		//driver.findElement(By.xpath(" (//div[@id='username_container']/input)[1]")).sendKeys("Hello");
		
		//driver.findElement(By.xpath(" ( //form[@name='login']/input)[2]")).sendKeys("Hii");
		
		
		
		// 3 child -parent   -   //childXpath/parent::parentTagname 
		
		//driver.findElement(By.xpath("  //div[@id='idcard-container']/parent::div")).sendKeys("Hello");
		
		
		
		// 4 xpath with text   - //textname[text()= 'googlr offered in ']
		
		 //driver.findElement(By.xpath("//a[text()='Forgot Your Password?'] ")).click();
		
		
		// 5 contains xpath  - // *[contains(@type,'sub')]
		 
		 driver.findElement(By.xpath("//input[contains(@type,'email')] ")).sendKeys("Hello");
			 
		
		 
		   /*
		
		 // 6 Following -sibling --- 
		  
		---- topsiblingxapth/following-sibling::bottomsiblingtagname 
		  
		 //input[@name='username']/following-sibling::input 
		  
		  
		 
	   // 7 Preceding sibling -- 
		  
		---- bottomSiblingXpath/preceding-sibling::topsiblingtagname 
		  
		  
		  
		 <div id="email> 
		  
		 <div name="hello> 
		  
		  
		 1-> 2    --floowing 
		  
		 2>1 --> precding   
		  
		  
		   
		  
		// 8  css selector --- 
		  
		---- tganame[attribute='value'] 
		  
		 input[name='username'] 
		  
		  
		// 9 parent child css slector -- 
		  
		  
		---- parentCssSelector childTagName 
		  
		  
		 if we found multipl matches  
		  
		---- parentCssSelector childTagName:nth-child(1) 
		  
		  
		 Css selector coinsder hiddenelements -- 
		 child parent css slector is not pssoible ---
		 
		 */
		 
		 
		 
	}	
		
}
