package InterfaceDemo2;

public class Google implements SearchEngine {

	@Override
	public void search(String query) {
		// TODO Auto-generated method stub
		 System.out.println("Google: Searching for '" + query + "'");
	}

	@Override
	public void rankResults(String query) {
		// TODO Auto-generated method stub
		 System.out.println("Google: Ranking search results for '" + query + "'");
	}

}
