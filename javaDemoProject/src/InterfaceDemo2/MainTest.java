package InterfaceDemo2;

public class MainTest {
public static void main(String[] args) {
	 // Test Twitter implementation
    twitter tw = new twitter();
    tw.post("Hello Twitter!");
    tw.likePost(123);
    System.out.println("*****************************************************");
    // Test YouTube implementation
    YouTube youTube = new YouTube();
    youTube.uploadVideo("Java Tutorial", "Learn Java Programming");
    youTube.playVideo("Java Tutorial");

    System.out.println("*****************************************************");
    // Test Google implementation
    Google google = new Google();
    google.search("About Lemon Rice");
    google.rankResults("Lemon Rice Recipe");
    
    System.out.println("*****************************************************");
    // Test LinkedIn implementation
    LinkedIn linkedIn = new LinkedIn();
    linkedIn.connectWith("ypratik");
    linkedIn.message("ypratik", "Hello Shivam, let's connect on LinkedIn!");
}
}
