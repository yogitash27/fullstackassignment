package bean;
public class Account 
 {
	private int acc_no;
	private String name;
	private float amount;

	/*public Account() {
		super();
	}*/
		
	public Account(int acc_no, String name, float amount) {
		//super();
		this.acc_no = acc_no;
		this.name = name;
		this.amount = amount;
	}
	public int getAcc_no() {
		return acc_no;
	}
	
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getAmount() {
		return amount;
	}
	
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
}
