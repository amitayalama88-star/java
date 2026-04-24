package flowcontrols;

import java.util.Scanner;

public class nesteddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enyter the age");
		int age =sc.nextInt();
		if(age>18) {
			System.out.println("enter the weight");
			int weight =sc.nextInt();
			if(weight>40)
				System.out.println("she/he can gibve blood");
			else
				System.out.println("she.he can not give blood");
		}

	}

}
