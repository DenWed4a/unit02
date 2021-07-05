package com.training.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		double a = -1.0;
		double b = 2.0;
		double c = -3.0;
		if(a>0) {
			a = Math.pow(a, 2);
		}else if(a<0) {
			a = Math.pow(a, 4);
		}
		
		if(b>0) {
			b = Math.pow(b, 2);
		}else if(a<0) {
			b = Math.pow(b, 4);
		}
		
		if(c>0) {
			c = Math.pow(c, 2);
		}else if(a<0) {
			c = Math.pow(c, 4);
		}

	}

}
