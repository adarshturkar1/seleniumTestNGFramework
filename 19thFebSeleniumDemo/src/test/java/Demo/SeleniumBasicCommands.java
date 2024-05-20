package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCommands {

	//cntrl+shift+o 
	 	public static void main(String[] args) throws InterruptedException { 
	 		 
	 		//To luanch thr browser-- 
	 		WebDriver driver=new ChromeDriver(); 
	 		 
	 		//session id - 1 
	 		 
	 		 
	 		// to open the url 
	 		driver.navigate().to("https://www.amazon.in/"); //1 
	 		 
	 		driver.manage().window().maximize();  //1 
	 		 
	 		 
	 		//get the current url 
	 		System.out.println(driver.getCurrentUrl());  //1 
	 		 
	 		// get the title 
	 		 
	 		System.out.println(driver.getTitle());  //1 
	 		 
	 		driver.navigate().back(); 
	 		 
	 		Thread.sleep(2000); 
	 		 
	 		driver.navigate().forward(); 
	 		 
	 		driver.navigate().refresh(); 
	 		 
	 		//diffeence between driver.close and driver.quit(); 
	 		 
	 		// clsoe --it wil close only focused window -- 
	 		//quit --it will close all opened windows  
	 		 
	 		 
	 		//driver.close(); //1 
	 		 
	 		//driver.get("https://www.google.com/"); //1-- invalid  
	 		 
	          driver.quit();	//1	 
	 	//	driver.get("https://www.google.com/"); //-session id null  
	 		 
	  
	 		//close will not terminate the seeion but quit will terminate the session 
	 		 
	 		 
	 		// diffrence between get and navigate(); 
	          
	         //naviage mainetain the browser history and cookies so we can naviaget forwad and backword -- 
	           
	 		// get -- it will wait until page loads completely 
	          //navaiget-- it will not wait until page loads properly  
	 		 
	 	 
	           
	 	} 
	 }