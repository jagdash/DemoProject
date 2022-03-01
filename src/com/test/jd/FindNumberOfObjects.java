package com.test.jd;

public class FindNumberOfObjects {
	
	static int cnt = 0;
	public FindNumberOfObjects() {
		cnt ++;
	}
  
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		FindNumberOfObjects f1 = new FindNumberOfObjects();
		FindNumberOfObjects f2 = new FindNumberOfObjects();
		FindNumberOfObjects f3 = new FindNumberOfObjects();
		
		System.out.println("number of Objects: "+ cnt);
		
	}

}
