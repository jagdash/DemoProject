package com.string.jd;

//Compare String without equals() and compareTo() methods

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        compareStrings("Hello Jagmohan", "Hello Suravi");
	}
	
	public static void compareStrings(String s1, String s2) {
		
		//First way
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if (s1.length() != s2.length()) {
			System.out.println("Not Equal");
			return;
		}
		
		//2nd way
		for (int i=0, j=0; i<s1.length(); i++,j++) {
		if (s1.charAt(i) != s2.charAt(j)) {
			System.out.println("Not Equal");
			return;
		}
		}
		System.out.println("Equal");
       
		//with using methods
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
	}

}
