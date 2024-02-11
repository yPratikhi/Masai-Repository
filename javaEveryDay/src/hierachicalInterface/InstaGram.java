package hierachicalInterface;

public class InstaGram extends Meta{
//static
	public static void intaVido() {
		System.out.println("In instagram we can Upload Long and Short videos");
	}
	
	//non static
	public void aboutInsta() {
		System.out.println("Instagram is a very Popula Application.");
	}
	
	public static void main(String[] args) {
		Facebook fc = new Facebook();
	    fc.aboutFacebook();
	}
	
}
