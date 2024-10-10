package helloworld;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name: ");
		String name = scanner.nextLine();
		System.out.println("Score: ");
		double score = scanner.nextDouble();
		if (score > 10) {
			System.out.println("So diem ban nhap khong hop le");
		} else {
			System.out.println(name + " co diem TB = " + score);
		}
		scanner.close();
	}
}
