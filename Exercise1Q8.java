package com.rays.basics;

public class Exercise1Q8 {
public static void main(String[] args) {
	
	int a[][]=new int[9][10];
	
	for (int i = 1; i < a.length; i++) {
		for (int j = 1; j < a.length; j++) {
			a[i][j]=i*j;
			
			System.out.print(a[i][j]+  "\t");
			
			
		}System.out.println();
		
				
	}
	
}
	
	
}
