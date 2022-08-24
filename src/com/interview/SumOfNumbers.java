package com.interview;

public class SumOfNumbers {
	//output=114
	public static void main(String[] args) {
		int count=0;
		String s="nianfiabfibf10bbb100nbii4";
		//String s1 = s.replace("n", "9").replace("i", "7").replace("b", "2").replace("f", "6").replace("a", "8");
		s=s.replaceAll("\\D", " ");
		s=s.trim();
		s=s.replaceAll(" + ", " ");
		
		String[] split = s.split(" ");
		for (String string : split) {
			int sum = Integer.parseInt(string);
			count=count+sum;
			}
	   System.out.println(count);
		
		}
		
		}
		
		
		
	
		
	


