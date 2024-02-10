package Day4;

public class Amazon {
    String username ;
    String mobile;
    String emailid;
    
    //1.Constructor name should be same as the Class name.
    //2.Constructor does not have any return type
    //3.Constructor does not return any values.
    //4.constructor always non static.
    
    Amazon(String uname,String mob,String mailid){
    	username = uname;
    	mobile = mob;
    	emailid = mailid;
    }
      
    public static void main(String[] args) {
		//Creating the object
    	//5.Whenever we call the object then the constructor will invoke.
    	Amazon amz = new Amazon("ypratik123","8879788776","ypratikhi@gmail.com");
    	
    	System.out.println(amz.username);
    	System.out.println(amz.mobile);
    	System.out.println(amz.emailid);
    
    	System.out.println("**********************************************");
    	
    	Amazon amz2 = new Amazon("yshivam123","8879788776","yshivam@gmail.com");
    	
    	System.out.println(amz2.username);
    	System.out.println(amz2.mobile);
    	System.out.println(amz2.emailid);
    	
    	
	}
}
