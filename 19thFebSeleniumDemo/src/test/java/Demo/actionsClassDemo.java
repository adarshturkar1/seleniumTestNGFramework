package Demo;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions; 
 
public class actionsClassDemo { 
 
	//To pefrom mouse related events --doubleclic,righclick,draganadrdrodp,mousehover 
	public static void main(String[] args) throws InterruptedException { 
		 
		 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		 
		 
		 
		Actions a=new Actions(driver); 
		 
		WebElement d=driver.findElement(By.xpath("//input[@id='checkBoxOption1']")); 
		 
		Thread.sleep(2000); 
		a.doubleClick(d).perform(); 
		 
		 
		//This is for right click 
		//a.contextClick(d).perform(); 
		 
		driver.get("https://www.amazon.in/"); 
		 
		WebElement k=driver.findElement(By.xpath("//a[@id='nav-link-accountList']")); 
		 
		a.moveToElement(k).build().perform(); 
		 
		 
		driver.get("https://the-internet.herokuapp.com/drag_and_drop"); 
		 
		 
		WebElement source=driver.findElement(By.xpath("//div[@id='column-a']")); 
		WebElement target=driver.findElement(By.xpath("//div[@id='column-b']")); 
 
		 
		a.dragAndDrop(source, target).build().perform(); 
		 
		 
		 
	} 
}