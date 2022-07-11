package com.rays.basics;

import java.time.LocalDate;
import java.time.Period;

public class StringDate2 {

	public static void main(String[] args) {
		
		LocalDate d=LocalDate.of(1997,05,12);
		LocalDate today=LocalDate.now();
		
		System.out.println(d);
		System.out.println(today);
		
		Period diff=Period.between(d,today);
		System.out.println(diff);
		System.out.println("years     "+diff.getYears());
		System.out.println("months    "+diff.getMonths());
		System.out.println("days      "+diff.getDays());
		
		
		
		
	}
}
