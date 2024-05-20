package Demo;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class framesHandelingDemo { 
	 
	 
   public static void main(String[] args) { 
	 
	   
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demoqa.com/frames"); 
		 
		// By index 
	//	driver.switchTo().frame(0); 
		 
	   //By name or ID 
    //   driver.switchTo().frame("frame1"); 
		 
        //By webelement -- 
       WebElement f=driver.findElement(By.xpath("//iframe[@id='frame1']")); 
       driver.switchTo().frame(f); 
		 
		 
		System.out.println(driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]")).getText()); 
		 
		 
		//This will switch the control outside the frame--- 
		 
		driver.switchTo().defaultContent(); 
		 
	 //  driver.switchTo().parentFrame(); 
	    
} 
 
}
