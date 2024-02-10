package hw4;


public class addOverloading {
public static void main(String[] args) {
	addOverloading ol = new addOverloading();
	
	System.out.println(ol.add(5, 2));
	System.out.println(addOverloading.add(5.4f, 2));
	System.out.println(ol.add(5.0300222, 2));
	System.out.println(ol.add(5.03f, 2.32f));
	
	ol.add();
}
void add() {
	int a = 5;
	int b = 4;
	System.out.println(a+b);
}

public int add(int a,int b) {
	return a+b;
}
public static float add(float a,int b) {
	return a+b;
}
 double add(double a,int b) {
	return a+b;
}
public float add(float a,float b) {
	return a+b;
}
}
