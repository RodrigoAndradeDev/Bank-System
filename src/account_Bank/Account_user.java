package account_Bank;

import java.util.Locale;
import java.util.Scanner;

import sysAccount.SysAccountUser;

public class Account_user {

	public static void main(String[] args) {
		SysAccountUser sysAccount;
		String yes = "y";
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter account holder: ");
		String holder = sc.nextLine();
		

		
		sysAccount = new SysAccountUser(number, holder);
		
		System.out.print("Is there na initial deposit (y/n)? ");
		String resp = sc.next();
		
		
		if (resp.equals(yes)) {
		  System.out.print("Enter initial deposit value: ");
		  double value = sc.nextDouble();
		  sysAccount.deposit(value);
		} else{
		  System.out.println();
		} 
		System.out.println(sysAccount.toString());
		System.out.println();
		
		int option;
		do {
			System.out.println("Choose one of these options: ");
			System.out.print("\r1- Deposit\n2- Withdraw\n3- Close");
			option = sc.nextInt();
			
			if(option == 1) {
				System.out.print("Enter a deposit value: ");
				double value = sc.nextDouble();
				sysAccount.deposit(value);
				System.out.println();
				System.out.println(sysAccount.toString());
				System.out.println();

			}else if(option == 2) {
				System.out.print("Enter a whitdraw value: ");
				double value = sc.nextDouble();
				sysAccount.whithdraw(value);
				System.out.println();
				System.out.println(sysAccount.toString());
				System.out.println();
			}
			
			
		}while(option != 3);
		
		System.out.print(sysAccount.toString());
		
		
		
		
		
	}

}
