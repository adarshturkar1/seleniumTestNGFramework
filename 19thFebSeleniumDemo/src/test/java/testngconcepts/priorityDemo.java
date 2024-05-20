package testngconcepts;

import org.testng.annotations.Test; 

public class priorityDemo { 
 
	@Test(priority=1) 
	public void method1() { 
 
		System.out.println("hello"); 
	} 
 
	@Test(priority=-1) 
	public void method2() { 
		System.out.println("hello123"); 
	} 
 
	@Test 
	public void method3() { 
		System.out.println("hello14"); 
	} 
 
}