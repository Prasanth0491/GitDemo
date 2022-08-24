package com.demo;

public class Demo2 extends Demo1{
		public void stuSub(){
		System.out.println("Student Subject  :  English");
		}
		public void stuSub1(){
		System.out.println("Student Subject  :  Tamil");
		}
		public static void main(String[] args){
		Demo2 f=new Demo2();
		f.stuSub();
		f.stuSub1();
		f.stuAge();
		f.stuBg();
		f.stuName();
		f.stuId();
		f.stuRoll();
		}

}
