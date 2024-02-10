package Day2;

public class stringMethod {
         public static void main(String[] args) {
        	 String s1 = "Masai";
        	 String s4 = "MASAI";
        	 
//        	 String is a Class and Non Primitive
//        	 And we can create an object of non-Primitive.
        	 
        	 String s2 = new String("MoolyaEd");
        	 String s3 = "     Jan Feb March                  ";
        	 
        	 System.out.println(s1);
        	 System.out.println(s2);
        	 
//        	 Pre defined method in String class
        	 
//        	 CharAt Method
        	 System.out.println(s1.charAt(0));
        	 System.out.println(s2.charAt(2));
        	 
//        	 Concat method
        	 System.out.println(s1.concat(s2));
        	 
//        	 Contains give you Boolean Type.
        	 System.out.println(s1.contains("z"));//false
        	 System.out.println(s2.contains("E"));//true
        	 
//        	 To UpperCase
        	 System.out.println(s1.toUpperCase());
        	 System.out.println(s2.toUpperCase());
        	 
//        	 To lowerCase
        	 System.out.println(s4.toLowerCase());
        	 
//        	 trim - remove unWanted spaces.
        	 System.out.println(s3.trim());
        	 
//        	 start with boolean Type
        	 System.out.println(s2.startsWith("M"));
     
//        	 Equal boolean type
        	 System.out.println(s1.equals(s2));
        			 
//        	 equalsIsIgonreCase means it will check the world are same 
        	 System.out.println(s4.equalsIgnoreCase(s1));//true
        	 
//        	 length
        	 System.out.println(s2.length()>s1.length());//true
        	 
//        	 replace
        	 System.out.println(s1.replace('a','b'));//Mbsbi
        	 
//        	 Strings are Immutable - Mutation means change
        	 
        	 String[] spl = s3.split("");
        	 
        	 for(int i=0;i<spl.length;i++) {
        		 System.out.println("Individual element"+spl[i]);
        	 }
        	 
        	 String[] spl2 = s2.split("E");
        	 
        	 for(int i=0;i<spl2.length;i++) {
        		 System.out.println(spl2[i]);
        	 }
         }
}
