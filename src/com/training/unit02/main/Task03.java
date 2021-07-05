package com.training.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("Введите три числа ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		double result = Math.pow(a, 2) - Math.pow(b-c, 2) + Math.log(Math.pow(b, 2) + 1);
		System.out.println(result);

	}

}
