package helloworld;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao 2 so nguyen");
		System.out.println("a:");
		int aValue = scanner.nextInt();
		System.out.println("b:");
		int bValue = scanner.nextInt();
		if (aValue == 0 && bValue == 0) {
			System.out.println("Phuong trinh co vo so nghiem");
		} else if (aValue == 0 && bValue != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			float result = (-(float) bValue / aValue);
			System.out.println("Phuong trinh co nghiem = " + result);
		}
		scanner.close();
	}
}
