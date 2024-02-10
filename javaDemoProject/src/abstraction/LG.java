package abstraction;

public class LG extends Television {
public static void main(String[] args) {
	LG tv =new LG();
	tv.display();
	tv.operatingSystem();
	tv.size();
}

@Override
public void display() {
	// TODO Auto-generated method stub
	System.out.println("LG has 4k Display.");
}

@Override
public void operatingSystem() {
	// TODO Auto-generated method stub
	System.out.println("LG has LGwebOS.");
}

@Override
public void size() {
	// TODO Auto-generated method stub
	System.out.println("LG TV size is 43.");
}
}
