package abstraction;

public abstract class Airtel {
	//If we want override the method we do not use static mehod
public static void call(){
	System.out.println("Call feacture in Airtel.");
}

//Abstract Method.
public abstract void sms();
public  abstract void internet4g();
public  abstract void roming();
}
