package com.string.jd;

public class SplitString {
    
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "radhey radhey maharaj ji";
		String[] wd = s.split(" ");
		
		//normal split based on white space
		/*
		 * for (String st : wd) { System.out.print(st+" "); }
		 */
		
		//split based on white space and divide the string into number of lines 
		for (String st : s.split(" ", 3)) {
			System.out.println(st + " ");
		}

	}

}
