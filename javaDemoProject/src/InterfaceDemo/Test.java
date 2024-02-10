package InterfaceDemo;

public class Test {
public static void main(String[] args) {
	CityGoverment cg = new CityGoverment("Ravindra Bhosle"); 
	
	System.out.println(Goverment.president);
	
	cg.corporatepolicies();
	cg.corporatepolicies("City Corporate","State Corporate");
	
	cg.taxpolicies();
	cg.pensionpolicies();
	
	
	
}
}
