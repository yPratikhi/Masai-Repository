package InterfaceDemo2;

public class twitter implements SocialMedia {

	@Override
	public void post(String content) {
		// TODO Auto-generated method stub
		 System.out.println("Twitter: Posting '" + content + "'");
	}

	@Override
	public void likePost(int postId) {
		// TODO Auto-generated method stub
		System.out.println("Twitter: Liking post with ID " + postId);
	}

}
