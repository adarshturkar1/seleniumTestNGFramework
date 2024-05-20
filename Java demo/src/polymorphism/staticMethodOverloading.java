package polymorphism;

public class staticMethodOverloading {
	public static void addition(int a, int b) { 
 		System.out.println(a+b); 
 		 
 	} 
 	 
 	public static void addition(double a, double b) { 
 		System.out.println(a+b+ " this is double"); 
 		 
 	} 
 	 
 	 
 	 
 	 
 	public static void main(String[] args) { 
 		 
  
 		 
 	     addition(10,10); 
 		 addition(10,10.5); 
 		 
 		 
 	} 
}
