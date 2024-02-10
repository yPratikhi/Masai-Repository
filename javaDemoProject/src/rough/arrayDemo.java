package rough;

public class arrayDemo {
	 public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 1, 3, 6};

	  
	        for (int i = 0; i < array.length; i++) {
	            boolean isUnique = true;
	      
	            for (int j = 0; j < array.length; j++) {
	                if (i != j && array[i] == array[j]) {
	                    isUnique = false;
	                    break;
	                }
	            }
	        
	            if (isUnique) {
	                System.out.println(array[i]);
	            }
	        }
	    }
}
