package expectionHandaling;

public class throwKeywords {
public static void main(String[] args) {
	int age = 15;
	try {
		if(age<18) {
			throw new NumberFormatException("Age is less than 18");
		}else {
			System.out.println("Eligible");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("Exception handling");
	}finally {
		System.out.println("after age");
	}
	System.out.println("After finally");
}
}
