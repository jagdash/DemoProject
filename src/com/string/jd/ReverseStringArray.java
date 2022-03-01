package com.string.jd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringArray {
	public static void main(String[] args) {
		String[] stDays = new String[] {"sun", "mon", "tue", "wed"};
		List<String> ls = Arrays.asList(stDays);
		Collections.reverse(ls);
		stDays = (String[])ls.toArray();
		System.out.println("Reverse String: ");
		for(int i=0; i<stDays.length; i++) {
			System.out.println(stDays[i]);
		}
	}

}
