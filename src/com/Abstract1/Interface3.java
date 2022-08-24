package com.Abstract1;

public  class  Interface3 implements Interface1,Interface2 {

	
	@Override
	public void username1() {
		// TODO Auto-generated method stub
		System.out.println("prasanth");
	}

	@Override
	public void username2() {
		// TODO Auto-generated method stub
		System.out.println("yamuna");
		
	}

	@Override
	public void username() {
		// TODO Auto-generated method stub
		System.out.println("harshitha");
		
	}

	@Override
	public void password() {
		// TODO Auto-generated method stub
		System.out.println("pass");
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login");
		
	}
	public static void main(String[] args) {
		Interface3 in=new Interface3();
		in.username();
		in.username1();
		in.username2();
		in.login();
		in.password();
		
	}
}
