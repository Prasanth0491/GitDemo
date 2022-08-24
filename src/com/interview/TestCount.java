package com.interview;

public class TestCount {
	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i<=100; i++) {
			String s = String.valueOf(i);
			if (s.contains("0")) {
				count=count+1;	
			}	
			if (s.contains("00")) {
				count=count+1;
				
			}
			
		}
		System.out.println("number of zero's is : " +count);
	}
}
