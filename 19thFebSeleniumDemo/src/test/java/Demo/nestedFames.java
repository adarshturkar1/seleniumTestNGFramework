package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class nestedFames { 
	 
	public static void main(String[] args) throws InterruptedException { 
		 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/nested_frames"); 
		 
		/* 
		FrameSet --your control here -- 
		    
		   FramTop  
		          
				 Left  middle   right 
				  
		   FramBottom 
		    
		    
		    
		 1.swith to framtop --  
		 2.grab the left text and print 
		 3.swit toparent frame  
		 4.switch to miidle - 
		 5. grab the middle texta nd rpint 
		 6.swith to parent frame  
		 7.swithc to right  
		 8. grab the text and print  
		 9.switch to default conetnt 
		 10. swith to frame bottom -- 
		 11.text grab and print */ 
		 
		 
		 WebElement FrameTop=driver.findElement(By.xpath("//frame[@name='frame-top' ]")); 
	     driver.switchTo().frame(FrameTop); 
	       
	      // WebElement FrameLeft=driver.findElement(By.xpath("//frame[@name='frame-left' ]")); 
	       driver.switchTo().frame(0); 
	       System.out.println(driver.findElement(By.xpath("   //body[contains(text() , 'LEFT')]")).getText());
		
	      	       
	      // WebElement FrameMiddle=driver.findElement(By.xpath("//frame[@name='frame-Middle' ]")); 
	       driver.switchTo().parentFrame();
	       driver.switchTo().frame(1); 
	       System.out.println(driver.findElement(By.xpath("   //div[@id='content' ] ")).getText());
	       
	       
	       // WebElement FrameRight=driver.findElement(By.xpath("//frame[@name='frame-right']")); 
	       driver.switchTo().parentFrame();
	       driver.switchTo().frame(2); 
	       System.out.println(driver.findElement(By.xpath("   //body[contains(text() , 'RIGHT')] ")).getText());
	     
	       
	       driver.switchTo().defaultContent();
	       WebElement FrameBottom=driver.findElement(By.xpath("//frame[@name='frame-bottom'] ")); 
		   driver.switchTo().frame(FrameBottom); 
		   System.out.println(driver.findElement(By.xpath("   //body[contains(text() , 'BOTTOM')] ")).getText());  
	
	       
	       
	      // driver.switchTo().defaultContent();
	       
	  
	} 
 
}
