package Demo;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class headlessMode { 
 
	public static void main(String[] args) { 
 
		ChromeOptions co = new ChromeOptions(); 
 
		co.addArguments("headless"); 
 
		WebDriver driver = new ChromeDriver(co); 
		driver.get("https://demoqa.com/frames"); 
 
		System.out.println(driver.getCurrentUrl()); 
	} 
 
}