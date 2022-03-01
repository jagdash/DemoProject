package com.string.jd;

import java.util.StringTokenizer;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "good morning maharaj ji";
		
		//reverse the string 
		char[] st = s.toCharArray();
		for (int i = st.length - 1; i >=0; i--) {
			System.out.print(st[i]);
			
		}
		System.out.println("\n");
		
		//reverse the string word wise
		String[] s1 = s.split(" ");
		for (int i = s1.length - 1; i>=0; i--) {
			System.out.print(s1[i]+ " ");
		}
		
		System.out.println("\n");
		System.out.println("String-Builder");
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse().toString());
		
		System.out.println();
		StringTokenizer s3 = new StringTokenizer(s);
		String s2 = " ";
		while (s3.hasMoreTokens()) {
			s2 = s3.nextToken() + " "+s2;
		}
		System.out.println("Tokenwise Reverse");
		System.out.println(s2);
		
		
		
		
		
		
		

	}

}
