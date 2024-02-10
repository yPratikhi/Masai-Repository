package ProgramHandling;

public class NullPointerExceptionExample {
	@SuppressWarnings("null")
	public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length();
            System.out.println("Length of string: " + length);
        } catch (NullPointerException e) {
        	e.printStackTrace();
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
