package Demo;

import java.io.File; 
import java.io.IOException; 
 
import org.apache.commons.io.FileUtils; 
import org.openqa.selenium.By; 
import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class screenshotInSelenium { 
	 
	 
	public static void main(String[] args) throws IOException { 
		 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		 
		// Fulll screenshot 
 
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(src, new File("C:\\Users\\adars\\OneDrive\\Pictures\\Screenshots\\test1.png")); 
 
		 
		 
		 
		// partial screenshot--selenium 4 -- 
 
		WebElement b = driver.findElement(By.xpath("//input[@id='hide-textbox']")); 
 
		File src1 = b.getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(src1, new File("C:\\Users\\adars\\OneDrive\\Pictures\\Screenshots\\screenshot1.png")); 
 
		 
		 
	} 
 
}