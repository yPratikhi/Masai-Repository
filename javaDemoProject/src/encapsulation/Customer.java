package encapsulation;

public class Customer {
public static void main(String[] args) {
	BankOfAustralia ba = new BankOfAustralia();
	
	ba.setAccountNumber("4546-4654-65446");
	ba.setAccountpin("12345");
	
	System.out.println(ba.getAccountNumber());
	System.out.println(ba.getAccountpin());
}
}
