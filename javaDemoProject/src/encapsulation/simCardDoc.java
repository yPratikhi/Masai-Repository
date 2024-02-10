package encapsulation;

public class simCardDoc {
   public static void main(String[] args) {
	simCard sim = new simCard();
	
	sim.setSimCardNumber("88558-44545");
	System.out.println(sim.getSimCardNumber());
	
	sim.setSimType("Its Post Payed");
	System.out.println(sim.getSimType());
	
	sim.setSimCardAddress("Mumbai Maharashtra.");
	System.out.println(sim.getSimCardAddress());
}
}
