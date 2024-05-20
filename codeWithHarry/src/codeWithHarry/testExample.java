package codeWithHarry;

import java.util.Scanner;


public class testExample {
	
	
	
	
 public static void main (String[] args ) {
	 
	 System.out.println( "Enter no. of students") ;
	 
	 try (Scanner sc = new Scanner(System.in)) {
		int stuNum= sc.nextInt();
		 
		 //System.out.println(stuNum);
		 
		 {
			
		
			 
		 for( int i=1; i<=stuNum ;i++ )
			
		 {
			 System.out.println( "Enter name of students" +" " +i) ;
			 
			// Scanner sd = new Scanner(System.in);
			 
			 String stuName= sc.next(); 
			
			 System.out.println(stuName) ;
			 
			 
			 
			 System.out.println( "Enter name of 5 Subject") ;
			 
			 for( int j=1; j<=5 ;j++ )
			 
			 {
				 
				 String z="";
				 
				 // Scanner se = new Scanner(System.in);
				 
				 String subName= sc.next(); 
				
				 System.out.println(subName) ; 
				 
				// z=12+" "+subName ;
				 
				// System.out.println(z) ; 
				 
				 
			 }
			

			 
		 }
		 
		 
		 
		 }
	}
	  
 }

}
