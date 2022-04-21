package Main;

//ABSTRACT CLASS AND METHODS
public abstract class AbstractAccountActions {
	String bankAccount;
	
	// default constructor
	public AbstractAccountActions() {
		
	}
	
	public AbstractAccountActions(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	
	// no method body
	abstract float withdraw(int total, int withdrawAmount);
	abstract float deposit(int total, int depositAmount);
	
	public String getBankAccount() {
		return bankAccount;
	}

}
