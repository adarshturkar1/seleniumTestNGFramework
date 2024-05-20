package JavaBasics;

public class StringMethods {

	 //String -class -- 
	  // Readymade methods.. 
	  //methods --some logic will be tehre -- 
	  public static void main(String[] args) { 
	   
	  
	  //length ---  1 2, 
	   //index-- length -1 = 
	   
	  
	  String s="Hello java i love"; 
	   
	  //length of the string 
	   System.out.println(s.length()); 
	   
	  //this iwll give character at specific index 
	   System.out.println(s.charAt(0)); 
	   
	                //uppercase 
	   System.out.println(s.toUpperCase()); 
	   //Lowecase 
	   System.out.println(s.toLowerCase()); 
	   
	  
	  // concat - 
	   //1st way -using + operator 
	  
	  String a="Hello"; 
	   String b="java"; 
	   System.out.println(a+" "+b); 
	  
	   
	  
	  //2nd way --using concat method -- 
	   System.out.println(a.concat(" "+b)); 
	   
	  
	  // escape character ---   \ 
	  
	   String k="Hello i \"love\" java"; 
	    System.out.println(k); 
	   
	   
	  String p= "i love \\\\ character"; 
	   System.out.println(p); 
	   
	  String d="I love @ character"; 
	   System.out.println(d); 
	   
	  
	 // Substring --  
	  
	  String h="hello java i love you"; 
	    
	  System.out.println(h.substring(4)); 
	                                     //endIndex-1  
	  System.out.println(s.substring(6, 17)); // 
	   
	 // equals, euqalignorecase, contains, trim,replace,ReplaceAll --HW-- 
	   
	 String t="Hello java"; 
	  String l="Hello"; 
	  System.out.println(t.equals(l));  //false 
	  System.out.println(t.equalsIgnoreCase(l)); //true 
	  System.out.println(l.contains(t)); //false 
	  
	 
	 // It will remove starting and ending spaces --- 
	  String j= "    My name is aboli   jkkcdkl  dvsklsklsklkv"; 
	  System.out.println(j.trim()); 
	  
	 //Replace all will alowed all rhe regex--- 
	  
	 String v="aboli hii hello"; 
	  System.out.println(v.replace("\\s", "")); 
	  
	 String ja="aboli hello hello"; 
	  System.out.println(ja.replaceAll("\\s", "")); 
	  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	 } 
	 }
