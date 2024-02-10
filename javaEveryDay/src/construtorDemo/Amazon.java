package construtorDemo;

public class Amazon {
String name ;
String mobile;
String emailId;

Amazon(String name,String mobile,String emailId){
	//this Keywords :We use this keyword when We have same name as Global variable
	this.name=name;
	this.mobile=mobile;
	this.emailId=emailId;
}

public static void main(String[] args) {
	//Now Creating a Object when we create a object then Constructor get Invoke
	Amazon amz = new Amazon("Pratik","879526856","ypratik@gmail.com");
	
  System.out.println("Name of Customer :"+amz.name);
  System.out.println("Mobile Number : "+amz.mobile);
  System.out.println("Email ID : "+amz.emailId);
  System.out.println("*************************************************************");
  Amazon amz2 = new Amazon("Shivam","798754465","yshivam@gmail.com");
  System.out.println("Name of Customer :"+amz2.name);
  System.out.println("Mobile Number : "+amz2.mobile);
  System.out.println("Email ID : "+amz2.emailId);
}
}
