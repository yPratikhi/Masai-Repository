package hw2;

public class multiDivideMethod {
	 public static void main(String[] args) {
		 multi(2,2);
		 div(4,2);
	 }
	 
	 public static void multi(int a ,int b) {
		 int result  = a * b;
		 System.out.println("Multiplication :"+result);
	 }
	 
	 public static void div(int a ,int b) {
		 int result  = a / b;
		 System.out.println("Division :"+result);
	 }
}
