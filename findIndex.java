package com.assignments;

public class findIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {1,2,3,4,5,6,7,8,9};
		int target = 8;
		int index = 0;
		for(int i =0; i<num.length; i++) {
			if(num[i] == target) {
				index =i;
				break;
			}
		}
		System.out.println(index);
		

	}

}
