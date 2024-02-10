package objectClass;

public class carMods {
      public static void main(String[] args) {
		cars cr = new cars();  //calling the object
		
		System.out.println("Brand :"+cr.brand);
		System.out.println("Color :"+cr.color);
		
		//non static call
		cr.speed();
		cr.safetyRating();
		
		//static call
		cars.features();
		cars.interior();
	}
}
