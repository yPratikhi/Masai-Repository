package InterfaceDemo2;

public class YouTube implements VideoStreaming {

	@Override
	public void uploadVideo(String videoTitle, String videoContent) {
		// TODO Auto-generated method stub
		 System.out.println("YouTube: Uploading video '" + videoTitle + " Releted to :"+videoContent);
		 
	}

	@Override
	public void playVideo(String videoTitle) {
		// TODO Auto-generated method stub
		System.out.println("YouTube: Playing video '" + videoTitle + "'");
	}

}
