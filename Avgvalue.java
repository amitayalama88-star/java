package com.assignments;

public class Avgvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5,6,8};
		int sum = 0;
		for (int i=0; i<num.length; i++) {
			sum = sum+num[i];
		}
		int avg = sum/num.length;
		System.out.println("The average is: " + avg);
		

	}

}
