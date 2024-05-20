package inheritance;

public class hirarchcialC extends hirarchcialA {

public void method3 () {
		
		System.out.println(" im from method 3");
		
		
	}
	
	public static void main (String [] args) {
		
		hirarchcialC obj=new hirarchcialC();
		
		obj.method1();
		obj.method3();
		 
	}
	
	
}
