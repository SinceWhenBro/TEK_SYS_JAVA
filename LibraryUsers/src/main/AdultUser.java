package main;

public class AdultUser implements LibraryUser{
	
	private int age;
	private String bookType;
	
	public AdultUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	@Override
	public void registerAccount(String name, int age) {
		if(age > 12) {
			System.out.println("You have successfully registered under an Adult Account");
		} else {
			System.out.println("Sorry age must be greater than 12 to register as an adult");
		}
		
	}
	@Override
	public void requestBook(String bookType, int checkoutTime) {
		if(bookType == "Fiction") {
			System.out.println("Book issued successfully, please return the book within 7 days.");
		} else {
			System.out.println("Sorry you are only allowed to take adult Fiction books");
		}
	
	}
	
	@Override
	public String toString() {
		return "AdultUser [age=" + age + ", bookType=" + bookType + "]";
	}
	
}
