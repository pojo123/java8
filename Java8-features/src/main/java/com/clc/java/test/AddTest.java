package com.clc.java.test;

interface FTest {

	public void add(int a, int b);

}

//class Add implements FTest {
//
//	public void add(int a, int b) {
//
//		System.out.println("sum is:" + (a + b));
//	}
//}             No need to write the commented part for functional interface, we can directly jump to main method


public class AddTest {
	
	public static void main(String[] args) {

		FTest t = (a, b) -> System.out.println("sum is:"+(a+b));;
		t.add(10, 20);
		t.add(100, 200);
		t.add(50, 100);
	}

}
