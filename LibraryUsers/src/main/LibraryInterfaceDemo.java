package main;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		AdultUser adult1 = new AdultUser(5, "Kids");
		AdultUser adult2 = new AdultUser(23, "Fiction");
		
		adult1.requestBook(adult1.getBookType(), adult1.getAge());
		adult2.requestBook(adult2.getBookType(), adult2.getAge());
		
		
		KidUsers kid1 = new KidUsers(10,"Kids");
		KidUsers kid2 = new KidUsers(18,"Fiction");
		
		kid1.requestBook(kid1.getBookType(), kid1.getAge());
		kid2.requestBook(kid2.getBookType(), kid2.getAge());
		
		
		
		
		
		
	}

}
