package Demo;

import java.util.List; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class CalendarHandeling { 
 
	public static void main(String[] args) throws InterruptedException { 
 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
 
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click(); 
 
		// select the month and year 
		String t = ""; 
		while (!(t.equalsIgnoreCase("November 2024"))) { 
 
			Thread.sleep(2000); 
			driver.findElement(By.xpath("//a[@data-handler='next']")).click(); 
 
			WebElement month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]")); 
 
			t = month.getText() + " 2024"; 
			//t=November 2024 
		} 
		 
		 
	 
		 
         //dte selction 
		List<WebElement> obj = driver.findElements(By.xpath("//td[@data-month='10']")); 
 
		for (int i = 0; i < obj.size(); i++) { 
 
			if (obj.get(i).getText().equalsIgnoreCase("13")) { 
				obj.get(i).click(); 
				break; 
			} 
 
		} 
 
	} 
 
}