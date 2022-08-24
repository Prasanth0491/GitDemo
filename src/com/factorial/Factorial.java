package com.factorial;

public class Factorial {
	
	public static void factorial(){
		
	int	count=1;
	
	for (int i = 1; i <=5; i++) {
		count=count*i;	
	}
	System.out.println("factorial value is : " +count);
	}
	public static void main(String[] args) {
		factorial();
	}

}
