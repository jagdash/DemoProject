package com.string.jd;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<>();
		String line = "hi good morning this morning is looking nice, are you feeling good any way enjoy this morning";
		
		String[] wrd = line.split(" ");
		System.out.println(wrd.length);
		for (String a : wrd) {
			Integer fq = m.get(a);
			if(fq == null) {
				m.put(a, 1);
			}else {
				m.put(a, fq+1);
			}
		}
		System.out.println(m.size()+ "distinct words: ");
		System.out.println(m);
	}

}
