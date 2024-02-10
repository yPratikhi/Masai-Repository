package hw4;


public class subOverloadings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
subOverloadings ol = new subOverloadings();
		System.out.println(ol.sub(5, 2));
		System.out.println(subOverloadings.sub(5.4f, 2));
		System.out.println(ol.sub(5.0300222, 2));
		System.out.println(ol.sub(5.03f, 2.32f));
 
		ol.sub();
	}
	void sub() {
		int a = 5;
		int b = 2;
		System.out.println(a-b);
	}
	
	public  int sub(int a ,int b) {
		return a-b;
	}
	public static float sub(float a ,int b) {
		return a-b;
	}
	 double sub(double a ,int b) {
		return a-b;
	}
	public  float sub(float a ,float b) {
		return a-b;
	}

}
