package multilevel2;

public class Test {
public static void main(String[] args) {
	//Object of Monitor
	Monitor mo = new Monitor();
	System.out.println("Fetching the Monitor Class");
	//non static
	mo.tab();//Laptops.class
	//static
	Monitor.hdDisplay();
	System.out.println("*************************************************");
	//Object of StorageDevices
	StorageDevices st = new StorageDevices();
	System.out.println("Fetching the Monitor Class");
	System.out.println(st.founder);
	System.out.println(st.founting_date);
	
	//non Static
	st.mobile1();
	
	//static
	StorageDevices.laptop();
}
}
