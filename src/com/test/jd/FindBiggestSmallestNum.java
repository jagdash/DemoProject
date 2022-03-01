package com.test.jd;

public class FindBiggestSmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = new int[] {32,43,5,90,56,78,3,94,38};
		int sm = num[0];
		int lg = num[0];
		
		for (int i=1; i < num.length; i++) {
			if (num[i] > lg)
				lg = num[i];
			else if (num[i] < sm) 
			     sm = num[i];			
		}
		System.out.println("Large = "+ lg);
		System.out.println("Small = "+ sm);

	}

}
