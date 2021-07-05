package com.training.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		double a = 2.0;
		double b = 3.0;
		double c = 4.0;
		
		/*double first = Math.sqrt(Math.pow(b,2)+4*a*c);
		double second = Math.pow(a, 3)*c;
		double result0 = (b+first)/2 - second +b;*/
	
				
		double result  = (b + Math.sqrt(Math.pow(b,2)+4*a*c))/2 - Math.pow(a, 3)*c + b;
		
		System.out.println(result);

	}

}
