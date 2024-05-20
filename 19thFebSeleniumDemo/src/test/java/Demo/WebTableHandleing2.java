package Demo;

import java.util.List; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class WebTableHandleing2 { 
 
	public static void main(String[] args) { 
 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
 
		List<WebElement> obj1 = driver.findElements(By.xpath("(//table[@id='product'])[2]//tr/td[1]")); 
 
		List<WebElement> obj2 = driver.findElements(By.xpath("(//table[@id='product'])[2]//tr/td[2]")); 
 
		 
		for (int i = 0; i < obj2.size(); i++) { 
			String k = obj2.get(i).getText(); 
			if (k.equalsIgnoreCase("Engineer")) { 
				String t =obj1.get(i).getText(); 
				System.out.println(k+ " "+t); 
			} 
 
		} 
	} 
 
}