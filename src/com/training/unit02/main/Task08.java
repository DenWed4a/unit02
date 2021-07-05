package com.training.unit02.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		
		for(int i = a; i<=b; i=i+h) {
			
			double y = 2*Math.tan(i/2)+1;
			System.out.println(i+" "+y);
		}

	}

}
