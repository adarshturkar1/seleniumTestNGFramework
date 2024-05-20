package polymorphism;

public class BankAxis {
	//ovverideed method 
	 	public void rateOfInterest() { 
	 		System.out.println("ROI 8%"); 
	 	} 
	 	 
	 	public void method2() { 
	 		System.out.println("i am from method2"); 
	 	} 
	 	 
	 	public static void main(String[] args) { 
	 		 
	 		 
	 		//child  ref       child object 
	 		BankAxis obj=new BankAxis(); 
	 		 
	 		obj.method1(); 
	 		obj.method2(); 
	 		obj.rateOfInterest(); 
	 		//This will call all parent and child methods---oveerided method(child)		 
	 		 
	 		 
	 		//parent ref  prant obj 
	 		 Bank obj1   =  new  Bank(); 
	 		  
	 		 obj1.method1(); 
	 		 obj1.rateOfInterest(); 
	 		  
	 		 //This will call only parent methods -- 
	 		  
	 		//parent ref     child obj    ---  topcasting --upcasting 
	 		  Bank obj2=new BankAxis(); 
	 		   
	 		   obj2.method1(); 
	 		   obj2.rateOfInterest(); 
	 		   
	 		    
	 		   //This will call only parent methods but if oveeride method (child class) 
	 		  
	 		    
	 	//	BankAxis obj3=new Bank();   //Compile time error  --downcasting  
	 		 
	 		//This is not possible but we can achive forcefully as below -- 
	 		    
	 		    
	 		     //parent ref   child obj                    //chiuld object 
	 			Bank obj4=new BankAxis(); 
	 			BankAxis obj5=(BankAxis)obj4; 
	 			 
	 			obj5.method1(); 
	 			obj5.method2(); 
	 			obj5.rateOfInterest(); 
	 			 
	 	//This will call all parent and child methods---oveerided method(child)		 
	 				 
	 		 
	 		 
	 	} 
}
