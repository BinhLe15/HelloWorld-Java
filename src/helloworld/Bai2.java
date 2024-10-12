package helloworld;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chieu dai: ");
		double cd = scanner.nextDouble();

		System.out.println("Chieu rong: ");
		double cr = scanner.nextDouble();
		if (cr > cd || (cd <= 0 || cr <= 0)) {
			System.out.println("Chieu dai va chieu ronng khong hop le");
		} else {
			double cv = (cd + cr) * 2;
			double dt = cd * cr;
			System.out.println("Chu vi hinh chu nhat la: " + cv);
			System.out.println("Dien tich hinh chu nhat la:" + dt);
			System.out.println("Canh nho nhat la: " + Math.min(cd, cr));
		}

		scanner.close();
	}
}
