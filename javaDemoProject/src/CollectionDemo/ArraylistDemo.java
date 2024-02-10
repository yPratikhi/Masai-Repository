package CollectionDemo;

import java.util.ArrayList;

public class ArraylistDemo {
public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	ArrayList<Comparable> ar = new ArrayList<Comparable>();
	
	ar.add(1);
	ar.add('k');
	ar.add("Pratik Yadav");
	ar.add(false);
	ar.add(1.34f);
	ar.add(90.43747439);
	ar.add(56464646);
	
	
	System.out.println(ar);
	System.out.println("Length of arr : "+ar.size());
	
}
}
