package singleInheritance;

public class Test {
public static void main(String[] args) {
	Facebook fc = new Facebook();
	System.out.println(fc.ceo);
	fc.aboutMeta();
	Facebook.meta();
}
}
