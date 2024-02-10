package hw3;

public class aboutString {
         public static void main(String[] args) {
        	 String str1 = "Pratik";
        	 String str2 ="Yadav";
        	 
        	 String str3 ="   Masai       Student ";
        	 String str4 ="PRATIK";
        	 //length
        	 System.out.println("Length of str1: "+str1.length());
        	 System.out.println("Length of str2: "+str2.length());
        	 
        	 //concat
        	 System.out.println(str1.concat(str2));
        	 
        	 //trime
        	 System.out.println(str3.trim());
        	 
        	 //replace
        	 System.out.println(str3.replace('a','b'));
        	 
        	 //split
        	String[] spl  = str1.split("");
        	 for(int i=0;i<spl.length;i++) {
        		 System.out.println("Individual element "+spl[i]);
        	 }
        	 
        	 //toCharArray()
        	  char[] ch = str1.toCharArray();
        	 for(int i=0;i<ch.length;i++) {
        		 System.out.println(ch[i]);
        	 }
        	 
          //toLowerCase()
        	 System.out.println(str1.toLowerCase());
        	 
        	 //toUpperCase()
        	 System.out.println(str1.toUpperCase());
        	 
        	 //contains
        	 System.out.println(str1.contains("a"));
        	 
        	 //equals
        	 System.out.println(str1.equals(str4));
        	 
        	 //equalsIgnoreCase
        	 System.out.println(str1.equalsIgnoreCase(str4));
        	 
         }
}
