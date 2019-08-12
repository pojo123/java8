package com.clc.java.test;

public interface FunctInterface {

	public abstract void m1();

	default void m2() {
		
		System.out.println("default method");
	}
	
	static void m3() {
		
		System.out.println("static method");
	}
}
