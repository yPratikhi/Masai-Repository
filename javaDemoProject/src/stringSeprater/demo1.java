package stringSeprater;
//WAP to define a string s ="joker123124)(*(&*(&*&" , Separate numbers, alphabets and special characters.
public class demo1 {
public static void main(String[] args) {
	String s = "joker123124)(*(&*(&*&";
	
	String number="";
	String alphabets="";
	String splcharacter="";
	
	for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(Character.isDigit(ch)) {
			number+=ch;
		}else if(Character.isAlphabetic(ch)){
			alphabets+=ch;
		}else {
			splcharacter+=ch;
		}
	}
	
	System.out.println("Number : "+number);
	System.out.println("Alphabets : "+alphabets);
	System.out.println("Special Char : "+splcharacter);
}
}
