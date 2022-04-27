package com.perscholas.cafe;

import java.util.Scanner;

public class Main extends Product {

	public static void main(String[] args) {
		Product coffee = new Product("coffee", 2.50, "delicious");
		Product espresso = new Product("espresso", 1.75, "for those bitter days");
		Product cappuccino = new Product("cappuccino", 3.25, "DEElicious");

		Scanner scn = new Scanner(System.in);
		String prod;
		int quantity;

		try {
			System.out.println("Enter Product");
			prod = scn.nextLine();
			System.out.println("Enter Quantity?");
			quantity = scn.nextInt();

		} finally {
			if (scn != null) {
				scn.close();
			}
		}

		String menuOption;
		int finalQuantity = 0;
		String description = null;
		double subTotal = 0;
		double salesTax = 0;
		double price = 0;
		double total = 0;

		switch (prod) {
		case "coffee":
			menuOption = coffee.getName();
			finalQuantity = quantity;
			description = coffee.getDescription();
			price = coffee.getPrice();
			subTotal = coffee.calculateSubTotal(finalQuantity, price);
			salesTax = coffee.calculateSalesTax(finalQuantity, price);
			total = coffee.calculateProductTotal(finalQuantity, price);
			break;
		case "espresso":
			menuOption = espresso.getName();
			finalQuantity = quantity;
			description = espresso.getDescription();
			price = espresso.getPrice();
			subTotal = espresso.calculateSubTotal(finalQuantity, price);
			salesTax = espresso.calculateSalesTax(finalQuantity, price);
			total = espresso.calculateProductTotal(finalQuantity, price);
			break;
		case "cappuccino":
			menuOption = cappuccino.getName();
			finalQuantity = quantity;
			description = cappuccino.getDescription();
			price = cappuccino.getPrice();
			subTotal = cappuccino.calculateSubTotal(finalQuantity, price);
			salesTax = cappuccino.calculateSalesTax(finalQuantity, price);
			total = cappuccino.calculateProductTotal(finalQuantity, price);
			break;
		default:
			menuOption = "Not a valid item";
			break;
		}

		if (finalQuantity != 0) {
			for (int i = 0; i < finalQuantity; i++) {
				System.out.println(menuOption + "|" + description + "|" + "$" + price);
			}
			System.out.println("$"+Math.round("%2",subTotal));
			System.out.println("$"+salesTax);
			System.out.println("$"+total);
		} else {
			System.out.println("Nah bruh stop playin");
		}

	}

}
