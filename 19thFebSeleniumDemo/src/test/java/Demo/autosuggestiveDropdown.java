package Demo;

import java.util.List; 

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class autosuggestiveDropdown { 
	 
	public static void main(String[] args) throws InterruptedException { 
	 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
 
		 
		driver.findElement( By.xpath("//input[@id='autosuggest']")).sendKeys("ind"); 
		Thread.sleep(2000); 
		 
		/* This is not coreect approach  
		driver.findElement( By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ARROW_UP); 
		driver.findElement( By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ARROW_UP); 
		driver.findElement( By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ENTER); 
		*/ 
 
		 
		 
	  List<WebElement>	obj= driver.findElements(By.xpath("//a[@class='ui-corner-all']")); 
	   
	  for(int i=0;i<obj.size();i++) { 
		   
		  if(obj.get(i).getText().equalsIgnoreCase("India")) { 
			  //India 
			  obj.get(i).click(); 
			  break; 
		  } 
		    
	  } 
	   
	 
	  /* 
	  for(WebElement k:obj) { 
		  if(k.getText().equalsIgnoreCase("India")) { 
			  //India 
			   k.click(); 
			  break; 
		  } 
	  } 
	  */ 
		 
	 
		  
		 
	} 
 
} 
 
//diffrence --findElement   ---single webelement-- 
//if element is not correct then it will throw exception 
 
//and findelments --  List<Webelement>  -- 
//if element is not coreect then it will not throw any excepi