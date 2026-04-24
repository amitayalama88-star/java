package flowcontrols;

import java.util.Scanner;

public class bankmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double balance = 1000;
		System.out.println("1. check balance");

		System.out.println("2. deposit");

		System.out.println("3. withdraw");

		System.out.println("4. exit");

		System.out.println("5. enter the choice");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("balance " + balance);
			break;
		case 2:

			System.out.println("enter the amount to deposit");
			double deposit = sc.nextDouble();
			balance = balance +deposit;

			System.out.println("updated balance: " + balance);
			break;
		case 3:

			System.out.println("enter the amount to withdraw");
			double withdraw = sc.nextDouble();
			if(withdraw<=balance) {
			balance = balance -withdraw;

			System.out.println("updated balance: " + balance);
			}else
			{
				System.out.println("insufficent fund");
			}
			break;
		case 4:

			System.out.println("thnak you");
		
			break;
		default:
			System.out.println("choose 1 to 4");
		
			
		}
		    
		

	}

}
