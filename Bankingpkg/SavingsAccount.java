package Bankingpkg;
import java.util.Scanner;

public class SavingsAccount implements BankingInterface  {
	static int balance = 5000;
	  @Override
	public void withdraw(int x) {
		  if(balance >= x)
		  {
			  balance = balance - x;
			  System.out.println("please collect your money");
			  
		  }
		  
		  else
		  {
			  System.out.println("insufficeient Balance");
		  }
		
	}
	  @Override
	public void deposit(int y) {
		  System.out.println("enter the amount to be deposited");
		   
		  balance = balance + y;
		  System.out.println("your money has been succesfully deposited");
	}
	  @Override
	public void checkbalance() {
		  System.out.println("your balance is :" +this.balance);
		
	}
	  	
		
}
