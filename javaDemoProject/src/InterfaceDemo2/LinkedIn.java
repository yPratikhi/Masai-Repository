package InterfaceDemo2;

public class LinkedIn implements ProfessionalNetworking {

	@Override
	public void connectWith(String userName) {
		// TODO Auto-generated method stub
		System.out.println("LinkedIn: Connecting with " + userName);
	}

	@Override
	public void message(String userName, String message) {
		// TODO Auto-generated method stub
		System.out.println("LinkedIn: Sending message to " + userName + ": " + message);
	}

}
