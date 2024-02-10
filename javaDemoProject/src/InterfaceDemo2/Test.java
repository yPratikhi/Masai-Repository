package InterfaceDemo2;

public class Test {
public static void main(String[] args) {
	twitter tw = new twitter();
	System.out.println("Application :"+twitter.application);
	System.out.println("CEO :"+twitter.ceo);
     tw.likePost(2);
     tw.post("Hello Everyone");
}
}