package com.interview;

public class Interview_Program {
	public static void main(String[] args) {
		
		// output TESTING _gUEST_ IS VALID
		String s = "testing (Guest) is valid";
		String s2 = s.replace(")", "_").replace("(", "_");
		String s3 = s2.toUpperCase();
		char[] ch = s3.toCharArray();
		ch[9] =(char) (ch[9] + 32);
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
			
		}
			
			
	
		
	
		
		
			
	
		}
		
		}
		
	
		
	
	
	
	
	
	
	


