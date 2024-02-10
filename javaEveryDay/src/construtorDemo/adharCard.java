package construtorDemo;

public class adharCard {
String adharNumber;
String adharName;
String adharAddress;

adharCard(String adharNumber,String adharName,String adharAddress){
	this.adharNumber=adharNumber;
	this.adharName=adharName;
	this.adharAddress=adharAddress;
}
public static void main(String[] args) {
	adharCard ac = new adharCard("5544-4545-5456","Pratik Yadav","Mumbai Maharastra");
	System.out.println(ac.adharNumber);
	System.out.println(ac.adharName);
	System.out.println(ac.adharAddress);
}
}
