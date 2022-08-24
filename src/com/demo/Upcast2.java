package com.demo;

public class Upcast2 extends Upcast1 {
	public void mul1() {
		System.out.println("Multification");

	}
	@Override
	public void add1() {
		super.add1();
		System.out.println("modified");
	}
		public static void main(String[] args) {
			Upcast1 d = new Upcast2();
			d.add1();
			d.sub1();
		}
		
		
	}


