package encapsulation;

public class BankOfAustralia {

	private String customerName;
    private String accountNumber;
    private String accountpin; 
 
    public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountpin() {
		return accountpin;
	}
	public void setAccountpin(String accountpin) {
		this.accountpin = accountpin;
	}
	
}
