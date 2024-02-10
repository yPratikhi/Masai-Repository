package expectionHandaling;

public class demo1 {
 public static void main(String[] args) {

	 try {
		  String[] str = new String[5];
			 System.out.println(str[5]);
	 }catch(IndexOutOfBoundsException i){
		 i.printStackTrace();
	 }finally {
		 System.out.println("I completed");
	 }
	
	   
	   System.out.println("Last line");
}
}
