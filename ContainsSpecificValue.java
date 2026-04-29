package com.assignments;

public class ContainsSpecificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {1,2,3,4,5,6,7,8};
		int num = 59;
		boolean Contain = false;
		for (int i = 0; i<number.length; i++) {
			if(number[i] == num) {
				Contain = true;
				break;
			}
			
			
		}
		if (Contain) {
            System.out.println("Value " + Contain + " was found");
        } else {
            System.out.println("Value " + Contain + " was not found");
        }

	}

}
