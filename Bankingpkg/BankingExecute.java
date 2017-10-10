package Bankingpkg;

import java.util.Scanner;

public class BankingExecute {
	public static void main(String args[])
	{

	  
	  Scanner s = new Scanner(System.in);
	  while(true)
	  {
		  System.out.println("Automatic Teller Machine");
		  System.out.println("choose 1 to withdraw,2 to deposit,3 to checkBalance");
		  System.out.println("choose your operation");
		  int n= s.nextInt();
		  BankingInterface b=new SavingsAccount();
		  
		 
		  switch(n)
		  {
		  case 1 : 
			  System.out.println("enter how much money");
			  int x=s.nextInt();
			 b.withdraw(x);
			  
			 
			  break;
			  
		  case 2 : 
			  System.out.println("enter how much money");
			  int z=s.nextInt();
			 b.deposit(z);
			  break;
			  
		  case 3 : 
			  b.checkbalance();
			  
			  break;
			  
		 
	  }
	  
	
	


	
	}
	}
}
