package tripathi.akash.account.model;

public class Account {

	private String accoutowner;
	private int accountnumber;
	private int pin;

	public Account(String accoutowner, int accountnumber, int pin) {
		super();
		this.accoutowner = accoutowner;
		this.accountnumber = accountnumber;
		this.pin = pin;
	}

	public String getAccoutowner() {
		return accoutowner;
	}

	public void setAccoutowner(String accoutowner) {
		this.accoutowner = accoutowner;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

}
