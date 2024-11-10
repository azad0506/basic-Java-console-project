package atm_machine_withClas_Object;

import java.util.Scanner;

public class Atm {
	Scanner sc=new Scanner(System.in);
	
	float balance=0;
	public void menu() {
		System.out.println("enter your choice");
		System.out.println("1.check A/C Balance \n2. Withdraw Money\n3. Deposit Money\n4. Exit");
		
		int choice=sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("total balance is "+balance);
			menu();
			
		}break;
		case 2: {
			System.out.println("enter the ammount to withdraw");
			int withdraw=sc.nextInt();
			if(balance>withdraw) {
				balance=balance-withdraw;
				System.out.println("withdraw successfully");
			
			}
			else {
				System.out.println("insufficient balance");
			}
			menu();
		}break;
		case 3: {
			System.out.println("enter the ammount");
			int deposit=sc.nextInt();
				balance=balance+deposit;
				System.out.println("balance deposit successfully");
				menu();
	
		}break;
		case 4: {
			
			
		}break;
		default:
			System.out.println("");
		}
	}

}
