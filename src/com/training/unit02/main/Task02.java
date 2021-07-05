package com.training.unit02.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		double c;
		double area;
		
		System.out.print("Введите размер катета (целое число) ->");
			while(!sc.hasNextInt()) {
				System.out.print("Введите целое число ->");
				sc.nextLine();
			}
		a = sc.nextInt();
		
		System.out.print("Введите размер второго катета (целое число) ->");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Введите целое число ->");
			
		}
		b = sc.nextInt();
		sc.close();
		c = Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2) );
		area = a*(double)b/2;
		
		System.out.println("Гипотенуза треугольника равна: "+c+"\nПлощадь треугольника равна: "+area);
	}

}
