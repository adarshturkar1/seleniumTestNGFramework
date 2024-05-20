package testngconcepts;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.Parameters; 
import org.testng.annotations.Test; 
 
import com.beust.jcommander.Parameter; 
 
public class paramaterization { 
 
	 
	@Test 
	@Parameters("url") 
	public void method1(String demo) { 
	 
		WebDriver driver=new ChromeDriver(); 
		 
		 
		driver.get(demo); 
		 
	} 
	 
	 
}