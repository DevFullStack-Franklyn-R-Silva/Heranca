package application;

import java.util.Locale;

import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		BusinessAccount businessAccount = new BusinessAccount(10, "Franklyn", 1500.00, 2000.00);
		businessAccount.loan(10);
		System.out.println(businessAccount);
	}

}
