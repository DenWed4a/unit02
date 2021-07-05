package com.training.unit02.main;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		int x;
		double y = 0.0;
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNextInt()) {
			sc.nextLine();
		}
		x = sc.nextInt();
		if(x<=-3) {
			y = 9;
		}else if(x>3) {
			y = 1/(Math.pow(x, 2)+1);
		}
		System.out.println("x = "+x+", "+"y = "+y);
		sc.close();

	}

}
