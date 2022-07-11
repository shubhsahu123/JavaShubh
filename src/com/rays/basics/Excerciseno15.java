package com.rays.basics;

public class Excerciseno15 {

	public static void main(String[] args) {
		
		int a[]= {15,17,22,5,65};
		int b=0;
		int t=0;
			
				for (int i = 0; i < a.length; i++) {
			if(t<=a[i]){
			b=t;
				t=a[i];
			
			}
			
		}System.out.println("second largest no. is  "+b);
		
		
		
		
	}
}
