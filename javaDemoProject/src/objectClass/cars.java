package objectClass;

public class cars {
   String brand ="Tesla";  
   String color="Red";
   
//   non static 
   public void speed() {
	   System.out.println("Speed of the car is 200.");
   }
   public void safetyRating() {
	   System.out.println("Safety Ratinf of car is Avg.");
   }
   
//   static 
   public static void features() {
	   System.out.println("Main features of this car is Auto paylate");
   }
   
   public static void interior() {
	   System.out.println("Tesla having best Interior");
   }
   
}
