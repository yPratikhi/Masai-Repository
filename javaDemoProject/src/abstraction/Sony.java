package abstraction;

public class Sony extends Television {
	public static void main(String[] args) {
		Sony so = new Sony();
		so.display();
		so.operatingSystem();
		so.size();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Sony TV has QLED.");
	}

	@Override
	public void operatingSystem() {
		// TODO Auto-generated method stub
		System.out.println("Sony TV has Andriod.");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("Sony TV size is 55.");
	}
}
