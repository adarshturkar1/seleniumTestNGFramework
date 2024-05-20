package inheritance;

public class multilevelB extends multilevelA {
	
	public void method2() {
		
		System.out.println(" im from method2 ");
		
		
		
	}
	

	public static void main (String[] args) {
		
		
		multilevelB obj = new multilevelB();
		
		obj.method1();
		obj.method2();
		
		
		
	}
	
	
	
	
}
