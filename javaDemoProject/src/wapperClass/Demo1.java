package wapperClass;

public class Demo1 {
         public static void main(String[] args) {
			int i=50; //primitive data type variable
			System.out.println("Primitive Value "+i);
			
			//AutoBoxing - is used to convert primitive to Wrapper Class type
			Integer wrapper_variable = i;
			System.out.println("Wrapper Variable value "+wrapper_variable);
			
			//The value will be same but the type of the variable is change
			
			char c = 'a';
			System.out.println("Primitive Value "+c);
			
			Character wrapper2 = c;
			System.out.println(wrapper2);
		}
}
