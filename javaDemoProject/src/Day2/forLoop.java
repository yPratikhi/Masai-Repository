package Day2;

public class forLoop {
	 public static void main(String[] args) {
        
		 int num =50;
		  
		 //Printing the 1 to 50 values.	 
//		 for(int i=1;i<=num;i++) {
//			 System.out.println(i);
//		 }
		 
       //Skip and Continue
//		 for(int i=1;i<=num;i++) {
//			if(i==26) {
//				continue;//It will skip the 26 then continue
//			}
//			if(i>=46) {
//				break;  //It will print till 45
//			}
//			System.out.println(i);
//		 }
		 
		 //Printing Event values in 1 to 50
      	 for(int i=1;i<=num;i++) {
			 if(i%2==0) {
				 System.out.println(i);
			 }
		 }
		 
		 
	 }
}
