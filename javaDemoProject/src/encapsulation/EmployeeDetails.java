package encapsulation;

public class EmployeeDetails {
public static void main(String[] args) {
	Employee em = new Employee();
	em.setEmpMobile("88998-44548");
	em.setEmpEmailId("ypratik@gmail.com");
	em.setEmpBankName("Kotak");
	
	System.out.println(em.getEmpMobile());
	System.out.println(em.getEmpEmailId());
	System.out.println(em.getEmpBankName());
}
}
