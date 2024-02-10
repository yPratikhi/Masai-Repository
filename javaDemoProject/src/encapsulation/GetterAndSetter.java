package encapsulation;

public class GetterAndSetter {
private String password;

//Getter and Setter

public String getPassword() {
	return password;
}//getter is mainly use to read the data.

public void setPassword(String password) {
	this.password= password;
}

public static void main(String[] args) {
	GetterAndSetter gs = new GetterAndSetter();
	
	gs.setPassword("pratik123");
	gs.setPassword("1234Pratik");
	
	String password = gs.getPassword();
	System.err.println(password);
}
}
