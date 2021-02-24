package net.codejava.ws;


public class AccountTest {

public static void main(String[] args) {
		
		BankApp acc1 = new BankApp();
		BankApp acc2 = new BankApp();
		BankApp acc3 = new BankApp();
		
		
		acc1.createAccount("Akash", 2207, 00);
		acc2.createAccount("Vibha", 1802, 01);
		acc3.createAccount("Anay", 2607, 02);
		acc1.setInitialBalance(50,"Akash", 2207, 00);
		acc1.deposit(5000,"Akash", 2207, 00);
		acc1.withdrawal(200,"Akash", 2207, 00);
		acc2.setInitialBalance(50,"Vibha", 1802, 01);
		acc3.setInitialBalance(500000,"Anay", 2607, 02);

		
		System.out.println("Balance for Akash account is :"+acc1.getCurrentBalance("Akash", 2207, 00));
		
		System.out.println("Balance for Vibha account is :"+acc2.getCurrentBalance("Vibha", 1802, 01));
		
		System.out.println("Cuurent Balance for Anay is "+acc3.getCurrentBalance("Anay", 2607, 02));

	}

}
