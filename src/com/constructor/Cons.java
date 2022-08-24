package com.constructor;

public class Cons {
	
	public Cons(int a) {
		this('j');
		System.out.println(a);
		
	}
	public Cons(String b) {
		
		System.out.println(b);
		
	}
	public Cons(char c) {
		this(90d);
		
		
		System.out.println(c);
		

}
	public Cons(double d) {
		this("prasanth");
		System.out.println(d);
		
	}
	
	public static void main(String[] args) {
		Cons c =new  Cons(20);
//		Cons c1= new Cons("prasanth");
//		Cons c2 = new Cons("J");
//		Cons c3 = new Cons("76.90");
//	
	}
}
