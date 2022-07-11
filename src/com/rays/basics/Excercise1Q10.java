package com.rays.basics;

public class Excercise1Q10 {
	public static void main(String[] args) {
		int number=153;
		int n=number;
		int r=0;
		int multi=0;
		int sum=0;
		while(n>0) {
		 
			 r=n%10;
			 multi=multi + (r*r*r);
			 sum=n/10;
						
		}if(multi==number) {
			System.out.println("given no. is  a armstrong no.");
			
		}else {
			System.out.println("not a armstrong no.");
		}
		
		
	}

}
