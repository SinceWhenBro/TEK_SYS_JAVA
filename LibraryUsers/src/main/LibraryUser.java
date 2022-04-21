package main;

public interface LibraryUser {
	void registerAccount(String name, int age);
	void requestBook(String bookType, int checkoutTime);
}
