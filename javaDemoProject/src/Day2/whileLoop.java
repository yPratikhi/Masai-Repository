package Day2;

public class whileLoop {
	public static void main(String[] args) {
		int n = 1;
		
		while(n<=100) {
			if(n==100) {
				break;
			}
			System.out.println(n);
			n++;
		}
	}
}
