package helloworld;

import java.util.Scanner;

public class Bai7 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		ax^2+bx+c=0
		Scanner scanner = new Scanner(System.in);
		System.out.println("ax^2 + bx + c = 0");
		System.out.println("a:");
		int aValue = scanner.nextInt();
		System.out.println("b:");
		int bValue = scanner.nextInt();
		System.out.println("c:");
		int cValue = scanner.nextInt();
		double result = 0;
		double delta = Math.pow(bValue, 2) - 4 * aValue * cValue;
		if (aValue == 0) {
			if (bValue == 0 && cValue == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			} else if (bValue == 0 && cValue != 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				result = (-(float) cValue / bValue);
				System.out.println("Phuong trinh co nghiem = " + result);
			}
		} else {
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				result = -bValue / (2 * aValue);
			} else if (delta > 0) {
				result = (-bValue + Math.sqrt(delta)) / (2 * aValue);
				System.out.println("x1: " + result);
				result = (-bValue - Math.sqrt(delta)) / (2 * aValue);
				System.out.println("x2: " + result);
			}
		}
		scanner.close();
	}
}
