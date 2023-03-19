package com.ts.swap;

public class Swap {

	public static void main(String[] args) {
		int a=45;
		int b=56;
		System.out.println("a= "+a+" b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a+" b= "+b);
	}

}
