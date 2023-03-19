package com.ts.swap;

public class SwapNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=38;
		int c=b;
		System.out.println("a= "+a+" b= "+b);
		b=a;
		a=c;
		System.out.println("a= "+a+" b= "+b);
	}

}
