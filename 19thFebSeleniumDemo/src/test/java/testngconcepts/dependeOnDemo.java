package testngconcepts;

import org.testng.Assert; 
import org.testng.annotations.Test; 
 
public class dependeOnDemo { 
	 
	 
 
	@Test(dependsOnMethods={"method2","method3"}) 
	public void Amethod() { 
		 
		System.out.println("hello"); 
	} 
	 
	 
	@Test 
	public void method3() { 
		 
		System.out.println("hello4"); 
	} 
}