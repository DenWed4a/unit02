package com.training.unit02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		int sum = 0;
		
		while(sc.hasNextInt()) {
			sum = sum + sc.nextInt();
			System.out.println(sum);
		}
		sc.close();

	}

}
