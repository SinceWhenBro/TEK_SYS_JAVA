package Main;

public class Main {

	public static void main(String[] args) {
		
		//Object and Memory SLIDE 14,10,8;
		
		//Constructing EMPLOYEE Object
		Employee empOne = new Employee("John","Smith", 12345, "Sales");
		Employee empTwo = new Employee("Tyler","Williams", 17375, "G.E.O aka the God");
		Employee empThree = new Employee("Cthulu","Bruhaha", 12647, "Tough guy");
		empThree.deposit(0, 100);
		
		Manager managerOne = new Manager("oh","my", 43079, "Manager", "Sales Timecards");
		Manager managerTwo = new Manager();
		managerTwo.setFirstName("Don");
		managerTwo.setLastName("Julio");
		managerTwo.setJobTitle("Brutalizer");
		managerTwo.setEmpl_id(00001);
		managerTwo.setTimeCards("BRUHAHAHAHAHA");
		
		System.out.println(empOne);
		System.out.println(empTwo);
		System.out.println(empThree);
		System.out.println(managerOne);
		System.out.println(managerTwo);
		
		//CREATING GENERIC OBJ -- INT
		Box<Integer> intBox = new Box<Integer>();
		intBox.add(234);
		intBox.add(420);
		intBox.add(678);
		intBox.add(111);
		
		System.out.println(intBox.get());
		
		//CREATING GENERIC OBJ -- STRING
		Box<String> strBox = new Box<String>();
		strBox.add("yo");
		strBox.add("im");
		strBox.add("a");
		strBox.add("savage");
		
		System.out.println(strBox.get());
		
		String str = "CHECKING";
		Accounts accOne = new Accounts(AccountTypes.valueOf(str));
		
		accOne.choseAccount();
		
		
	}

}
