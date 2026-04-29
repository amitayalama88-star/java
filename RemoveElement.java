package com.assignments;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5};
        int target = 3; // We want to "remove" this

    

        // Loop through every number
        for (int i = 0; i < numbers.length; i++) {
            
            // If the current number is NOT the target, print it!
            if (numbers[i] != target) {
                System.out.print(  numbers[i] + " ");
            }
        }

	}

}
