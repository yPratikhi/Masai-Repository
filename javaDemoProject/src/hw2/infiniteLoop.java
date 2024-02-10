package hw2;

public class infiniteLoop {
	public static void main(String[] args) {
		int n = 10;
//		forLoop
//		for(int i=1;i<n;i--) {
//			System.out.println(i);
//		}
		
//		While Loop
//		int i=1;
//		while(i<n) {
//			System.out.println(i);
//			i--;
//		}
		
   int i=1;
   do {
	   System.out.println(i);
		i--;
   }while(i<n);
	}
}