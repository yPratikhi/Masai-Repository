package Day4;

public class subOverloading {

	public static void main(String[] args) {
		subOverloading ol  = new subOverloading();
		
		System.out.println(ol.sub(5, 2));
		System.out.println(subOverloading.sub(5.4f, 2));
		System.out.println(ol.sub(5.0300222, 2));
		System.out.println(ol.sub(5.03f, 2.32f));
 
		ol.sub();
	}
	
	void sub() {
		int a = 6;
		int b = 4;
		
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
