package inheritance;

public class multilevelC extends multilevelB{

	public void method3() {
		
		System.out.println(" im form method3 ");
		
		
	}
	
	public static void main (String [] args) {
		
		multilevelC obj = new multilevelC();
		
		obj.method1();
		obj.method2();
		obj.method3();
	}
	
}
