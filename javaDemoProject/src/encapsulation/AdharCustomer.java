package encapsulation;

public class AdharCustomer  {
public static void main(String[] args) {
	Adhar ad = new Adhar();
	ad.setadharNumber("4544-45554-44454");
	ad.setadharAddress("Mumbai Maharashtra ");
	
	System.out.println(ad.getadharNumber());
	System.out.println(ad.getadharAddress());
}
}
