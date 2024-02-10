package Overriding;

public class Windows11 extends Windows {
	
	public void  winPaint() {
		System.out.println("Windows 11  paint");
	}
	public void  taskManger() {
		System.out.println("Windows 11  taskmanager");
	}
public static void main(String[] args) {
	//object of win11
	Windows11 w = new Windows11();
	
	//fetching data
	w.winPaint();
	w.taskManger();
	
	//fetching data
    w.officeProduct();
}
}
