package hw4;

public class mulOverloading {
 public static void main(String[] args) {
	mulOverloading ol = new mulOverloading();
	
	System.out.println(ol.mul(5,3));
	System.out.println(mulOverloading.mul(5.22f,3));
	System.out.println(ol.mul(5.09094,3));
	System.out.println(ol.mul(5.23f,3.22f));
	
	ol.mul();
}
 
 void mul() {
	 int a = 5;
	 int b = 2;
	 System.out.println(a*b);
 }
 
	public  int mul(int a ,int b) {
		return a*b;
	}
	public static float mul(float a ,int b) {
		return a*b;
	}
	 double mul(double a ,int b) {
		return a*b;
	}
	public  float mul(float a ,float b) {
		return a*b;
	}
}
