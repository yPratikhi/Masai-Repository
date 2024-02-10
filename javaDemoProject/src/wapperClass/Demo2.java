package wapperClass;

public class Demo2 {
public static void main(String[] args) {
	char c = 'r';
	char c1= '0';
	
	boolean status = Character.isAlphabetic(c);
	boolean Digitstatus = Character.isDigit(c1);
	
	System.out.println(status);
	System.out.println(Digitstatus);
}
}
