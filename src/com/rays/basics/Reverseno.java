package com.rays.basics;

public class Reverseno {

	public static void main(String[] args) {
		int a=123456;
		int b=0;
		
		for(;a!=0;a=a/10) {
			int remainder=a%10;
			b=b*10+remainder;
			
			
		}
		System.out.println("reverse no    "+b);
		
	}
	
}
