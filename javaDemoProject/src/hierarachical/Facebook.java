package hierarachical;

public class Facebook extends Meta {
     
	//Non-static
	public void fac() {
		System.out.println("Non static from the Facebook");
	}
	//Static
	public static void facebookPro() {
    	  System.err.println("This is FaceBook");
      }
      
      public static void main(String[] args) {
		Facebook fc = new Facebook();
		
	  System.out.println(fc.CEO);
	  //non static
	  fc.algorithm();
	  
	  
	  //taken from the Instagram.class. with the help of object creating.
	  Instagram in = new Instagram();
	  //fetching data From the data in Instageram.class (Its a static method)
	  Instagram.InstagramPro();
	  
	  //non-static method.
	  in.insta();
	}
}
