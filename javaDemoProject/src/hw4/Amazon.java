package hw4;

public class Amazon {
String username ;
String mobile;
String emailid;

Amazon(String username,String mobile,String emailid){
	this.username=username;
	this.mobile=mobile;
	this.emailid=emailid;
}

public static void main(String[] args) {
	Amazon amz = new Amazon("ypratik1","7978879879","ypratik@gmail.com");
	
	System.out.println(amz.username);
	System.out.println(amz.mobile);
	System.out.println(amz.emailid);
}
}
