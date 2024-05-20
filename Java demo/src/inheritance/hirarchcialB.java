package inheritance;

public class hirarchcialB extends hirarchcialA {

	public void method2 () {
		
		System.out.println(" im from method 2");
		
		
	}
	
	public static void main (String [] args) {
		
		hirarchcialB obj=new hirarchcialB();
		
		obj.method1();
		obj.method2();
		
	}
	
	
}
