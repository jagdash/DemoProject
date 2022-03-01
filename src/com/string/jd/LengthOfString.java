package com.string.jd;

public class LengthOfString {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Suravi Mohapatra";
		int count = 0;
		
		//without using length function
		for (char c : s.toCharArray()) 
		{
		  count ++;	
		}
		System.out.println("Length of the given String = "+ count);

		int cnt = s.length();
		System.out.println("Length = "+ cnt);
	}

}
