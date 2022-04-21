package Main;

public class Employee extends AbstractAccountActions {
	
	//FIELDS
	//PRIVATE -- can only be accessed by this class (Employee.java)
	//Java OOP Slides-->Slide 14
	//Encapsulation SLIDE 3
	//Method declarations slide 7-8, 16-23
	private String firstName;
	private String lastName;
	private long empl_id;
	private String jobTitle;
	private float totalAmount;
	
	//DEFAULT CONSTRUCTOR
	public Employee() {
		
	}
	
	//CONSTRUCTOR
	public Employee(String firstName, String lastName, long empl_id, String jobTitle) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empl_id = empl_id;
		this.jobTitle = jobTitle;
	}

	//GETTERS AND SETTERS -- right click-->click source-->generate getters and setters
	//PUBLIX -- class access modifier
	//void means not returning anything
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getEmpl_id() {
		return empl_id;
	}

	public void setEmpl_id(long empl_id) {
		this.empl_id = empl_id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	//OTHER METHODS
	@Override
	public String toString() {
		return "Employee ["
				+ "firstName=" + firstName + ","
				+ " lastName=" + lastName + ","
				+ " empl_id="  + empl_id + ","
				+ " jobTitle=" + jobTitle + ","
				+ " totalAmount=" + totalAmount + "]";
	}
	
	// OTHER METHODS FROM ABSTRACT CLASS
    @Override
    float withdraw(int amount, int withdrawAmount) {
        totalAmount = amount - withdrawAmount;
        return totalAmount;
    }

    @Override
    float deposit(int amount, int depositAmount) {
        totalAmount = amount + depositAmount;
        return totalAmount;
    }
	
}
