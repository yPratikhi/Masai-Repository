package hw4;

public class Masai {
String fullname ;
String studentId;
String emailid;

//1.Constructor name should be same as the Class name.
//2.Constructor does't have any return type
//3.Constructor does't return the value
//4.Constructor is non Static

Masai(String fname,String stdId,String mailid){
	fullname = fname;
	studentId = stdId;
    emailid = mailid;
}

public static void main(String[] args) {
	Masai  ma = new Masai("Pratik Yadav","ft32_227","ypratikhi@gmail.com");
	//When we call the object then the constructor will get invoke.
	
	System.out.println(ma.fullname);
	System.out.println(ma.studentId);
	System.out.println(ma.emailid);

	System.out.println("******************************************");
	
	Masai  ma2 = new Masai("Shivam Yadav","ft32_228","yshivam@gmail.com");

	System.out.println(ma2.fullname);
	System.out.println(ma2.studentId);
	System.out.println(ma2.emailid);
}
}
