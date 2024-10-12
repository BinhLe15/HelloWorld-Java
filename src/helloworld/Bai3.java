package helloworld;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Canh cua khoi lap phuong: ");
		double edge = scanner.nextDouble();
		if (edge > 0) {
			double volume = Math.pow(edge, 3);
			System.out.println("The tich khoi lap phuong la: " + volume);
		} else {
			System.out.println("Canh khong hop le");
		}
		scanner.close();
	}
}
