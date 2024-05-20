package Demo;

import java.util.List; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class checkboxHandeling { 
 
	public static void main(String[] args) { 
 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
 
		WebElement a = driver.findElement(By.xpath("//input[@id='checkBoxOption1']")); 
		a.click(); 
		 
		// checkbox, button, radibox-- 
		 
		System.out.println(a.isDisplayed()); //true 
		System.out.println(a.isEnabled()); //true 
		System.out.println(a.isSelected());  //true 
		 
		 
		 
		 
		List<WebElement> b=driver.findElements(By.xpath("//input[@type='checkbox']")); 
		System.out.println(b.size()); 
 
		//0 1 2  
		for(int i=0;i<b.size();i++) { 
			b.get(i).click(); 
		} 
		 
		 
		//  1 and 3rd position 
		 
		for(int i=0;i<b.size();i=i+2) { 
			b.get(i).click(); 
		} 
		 
		 
	      //  2nd and 4th position 
		 
			/*for(int i=1;i<b.size();i=i+2) { 
				b.get(i).click(); 
			}*/ 
			 
		 
		//using for each- 
		 
		for(WebElement k:b) { 
			k.click(); 
		} 
		 
		 
	} 
 
}