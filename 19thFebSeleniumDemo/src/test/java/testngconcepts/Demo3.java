package testngconcepts;

import org.testng.annotations.AfterClass; 
import org.testng.annotations.AfterSuite; 
import org.testng.annotations.AfterTest; 
import org.testng.annotations.BeforeClass; 
import org.testng.annotations.BeforeSuite; 
import org.testng.annotations.BeforeTest; 
import org.testng.annotations.Test; 
 
public class Demo3 { 
 
	@Test 
	public void method1() { 
		System.out.println("demo1method1"); 
 
	} 
 
	@Test 
	public void method2() { 
 
		System.out.println("demo1method2"); 
	} 
 
	@BeforeSuite 
	public void method3() { 
 
		System.out.println("demo1method3beforesuite"); 
	} 
 
	@AfterTest 
	public void method4() { 
		System.out.println("demo1method4AfterTest"); 
	} 
	 
	 
	@BeforeTest 
	public void method5() { 
 
		System.out.println("demo1method5BeforeTest"); 
	} 
	 
 
	@AfterSuite 
	public void method6() { 
 
		System.out.println("demo1method5AfterSuite"); 
	} 
 
	 
	@AfterClass 
	public void method7() { 
 
		System.out.println("demo1method7AfteClass"); 
	} 
	@BeforeClass 
	public void method8() { 
 
		System.out.println("demo1method8ABeforeClass"); 
	} 
 
 
}