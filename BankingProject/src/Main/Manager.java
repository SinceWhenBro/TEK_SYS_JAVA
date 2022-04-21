package Main;

//SYNTAX -- inherits Employee class
public class Manager extends Employee implements AccountActionsIMPL{
	
	//Java inheritance: SLIDE 27
	
	//FIELDS
	private String timeCards;
	
	//DEFAULT CONSTRUCTOR
	public Manager() {
		
	}
	
	//CONSTRUCTOR
	public Manager(String firstName, String lastName, long empl_id, String jobTitle, String timeCards) {
		//super keyword is used when inheriting data
		super(firstName, lastName, empl_id, jobTitle);
		this.timeCards = timeCards;
	}

	public String getTimeCards() {
		return timeCards;
	}

	public void setTimeCards(String timeCards) {
		this.timeCards = timeCards;
	}

	@Override
	public String toString() {
		return "Manager [timeCards=" + timeCards + "]";
	}

	@Override
	public void withdraw(float amount, float withdrawal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(float amount, float withdrawal) {
		// TODO Auto-generated method stub
		
	}
	
	
}
