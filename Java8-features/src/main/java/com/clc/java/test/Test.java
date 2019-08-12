package com.clc.java.test;

public class Test {

public static void main(String[] args) {
		
		FunctInterface fi = () -> System.out.println("m1 lambda implementation"); ;
		
		fi.m1();
		fi.m2();
		FunctInterface.m3();
	}

	
	
}
