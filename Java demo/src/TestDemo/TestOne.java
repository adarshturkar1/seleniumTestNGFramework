package TestDemo;

public class TestOne {

	public static void main (String[] args)
	{
		
		
		
		
		
		String a = "Hiii";
		
		System.out.println(a); 
		
		System.out.println(a.length()); 
		
		System.out.println(a.charAt(0));
		
		System.out.println(a.toUpperCase());
		 
		System.out.println(a.toLowerCase());
		
		
		String b = "Hello";
		String c = "Java";
		
		System.out.println(b+" "+c);
		System.out.println(b.concat(" "+c));

		
		String d = "Hello i \"love\" Java";
		System.out.println(d);
		
		
		String e = "Hello i love \\ Java";
		System.out.println(e);
		
		String f = "Hello i love @ Java";
		System.out.println(f);
		
		String h = "hello i love Java";
		System.out.println(h.substring(4));
 
		System.out.println(h.substring(4, 6));
		
		
		
		//String h = "hello i love Java";
		String i = "Hello i love Java";
		
		System.out.println(i.equals(h)); //false
		
		System.out.println(i.equalsIgnoreCase(h));	//true
		
		System.out.println(f.contains(i)); //false
		
		System.out.println(i.contains("i love")); //true
		
		
		
		String j = "    Hello i love Java    ";
		System.out.println(j.trim()); //Hello i love Java 
		 
	
	
		String g = "Hello java";
		
		System.out.println(g.replace( 'l' , 'c'  ) ); //Hecco java
		
		System.out.println(g.replace( "lo" , "pm"  ) ); // Helpm java
		
		System.out.println(g.replaceAll( "lo" , "pm"  ) ); // Helpm java
		 
		System.out.println(g.replaceAll( "\s" , "pm"  ) ); // Hellopmjava
		
		System.out.println(g.replaceAll( "\s" , ""  ) ); // Hellojava
		
         System.out.println(g.replace( "\\s" , ""  ) ); // Hello java
		
		System.out.println(g.replaceAll( "\\s" , ""  ) ); // Hellojava
		
		
		 
		
	}
	
}
