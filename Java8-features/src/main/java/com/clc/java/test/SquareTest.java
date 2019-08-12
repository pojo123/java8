package com.clc.java.test;

interface Demo {

	public int square(int n);
}

//class Square implements Demo {
//
//	public int square(int n) {
//
//		return n * n;
//	}
//
//}



public class SquareTest {
	
	
	public static void main(String[] args) {

		//Demo d = n -> n*n;             //or else write below statement
		Demo d = n -> {return n*n;};
		System.out.println("square of 4 is:" + d.square(4));
		System.out.println("square of 5 is:" + d.square(5));
	}

}
