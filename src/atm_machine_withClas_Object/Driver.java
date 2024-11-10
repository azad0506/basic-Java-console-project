package atm_machine_withClas_Object;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Atm atm=new Atm();
		
	 int  pin=1234;
		System.out.println("enter the pin");
		Scanner sc=new Scanner(System.in);
		int userpin=sc.nextInt();
		if(pin==userpin) {
			System.out.println("login successfully");
			System.out.println("==========");
			atm.menu();
		}
		else {
			System.out.println("enter a valid pin");
		}

	}

}
