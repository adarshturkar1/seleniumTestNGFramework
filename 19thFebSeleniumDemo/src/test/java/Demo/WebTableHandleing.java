package Demo;

import java.util.List; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class WebTableHandleing { 
 
	public static void main(String[] args) { 
 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
 
		List<WebElement> obj = driver.findElements(By.xpath("//table[@id='product']//td[4]")); 
 
		int sum = 0; 
 
		for (int i = 0; i < obj.size(); i++) { 
 
			String k = obj.get(i).getText(); 
 
			sum = sum + Integer.parseInt(k); 
		} 
 
		 
		String b = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText(); 
 
		String totalAmount = b.substring(24); 
 
		int l = Integer.parseInt(totalAmount); 
 
		if (sum == l) { 
 
			System.out.println("total amount is correct"); 
		} else { 
			System.out.println("total amount is not correct"); 
		} 
 
	} 
 
}