package InterfaceDemo2;

public class Test2 {
public static void main(String[] args) {
	YouTube yt = new YouTube();
    System.out.println(YouTube.streamingApp);
    System.out.println(YouTube.ceo);
    
    yt.playVideo("Aout Best Java IDE");
    yt.uploadVideo("About Lemon rice ", " recipe");
}
}
