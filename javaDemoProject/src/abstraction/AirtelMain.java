package abstraction;

public class AirtelMain extends Airtel {
	public static void main(String[] args) {
		AirtelMain ar = new AirtelMain();
		
		ar.sms();
		ar.roming();
		ar.internet4g();;
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("Airtel SMS");
	}

	@Override
	public void internet4g() {
		// TODO Auto-generated method stub
		System.out.println("Airtel Internet4g");
	}

	@Override
	public void roming() {
		// TODO Auto-generated method stub
		System.out.println("Airtel roming.");
	}

}
