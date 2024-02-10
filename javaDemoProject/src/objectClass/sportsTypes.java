package objectClass;

public class sportsTypes {
public static void main(String[] args) {
//	object calls
	schoolSports ss= new schoolSports();
	System.out.println("School Name :"+ss.school);
	
	//non static calls
	ss.badminton();
	ss.football();
	
	//static calls
	schoolSports.tennis();
	schoolSports.cricket();
}
}
