package InterfaceDemo;

public class CityGoverment implements Goverment {

	String citymayor;
	int seats;
	
	CityGoverment(String mayor){
		citymayor=mayor;
	}
	
	CityGoverment(int seats){
		this.seats = seats;
	}
	
	
	@Override
	public void corporatepolicies() {
		// TODO Auto-generated method stub
		System.out.println("City Corporate policies.");
	}

	@Override
	public void taxpolicies() {
		// TODO Auto-generated method stub
		System.out.println("City tax policies.");
	}

	@Override
	public void pensionpolicies() {
		// TODO Auto-generated method stub
		System.out.println("City pension policies.");
	}

	@Override
	public void corporatepolicies(String s1, String s2) {
		// TODO Auto-generated method stub
		System.out.println(s1);
		System.out.println(s2);
	}

}
