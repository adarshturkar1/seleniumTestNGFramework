package polymorphism;

public class methodOverloading {

	// we can have same method name with diffrent paramter 
	 
	 	// diffrent paramters-- 
	 	// count should be diffrent 
	 	//datataype should be  diffrent 
	 	// sequence should be diffrent 
	 	 
	 	 
	 	public void addition(int a, int b) { 
	 		System.out.println(a+b); 
	 		 
	 	} 
	 	 
	 	public void addition(double a, double b) { 
	 		System.out.println(a+b+ " this is double"); 
	 		 
	 	} 
	 	 
	 	 
	 	 
	 	 
	 	public static void main(String[] args) { 
	 		 
	 		 
	 		methodOverloading obj=new methodOverloading(); 
	 		 
	 		obj.addition(10,10); 
	 		obj.addition(10,10.5); 
	 		 
	 		 
	 	} 
	 	 
	 	 
	  
	 } 
	 //HW - 
	 //Can we overload static methods?   
	 //Can we overload main method?
	 
	

