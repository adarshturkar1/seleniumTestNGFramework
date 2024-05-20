package testngconcepts;

import org.testng.annotations.Test; 

public class groupsDemo { 
 
	@Test(groups="Regression") 
	public void method1() { 
 
		System.out.println("hiii"); 
 
	} 
 
	@Test(groups="Sanity") 
	public void method2() { 
 
		System.out.println("hiii2"); 
		 
	} 
 
}
