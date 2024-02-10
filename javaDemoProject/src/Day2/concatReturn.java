package Day2;

public class concatReturn {
	public static void main(String[] args) {
		String res = concat("Pratik "," Yadav");
		System.out.print(res);
	}
	
	public static String concat(String name1,String name2) {
		String result = name1+name2;
		return result;
	}
}
