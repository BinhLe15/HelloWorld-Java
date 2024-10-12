package helloworld;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		System.out.println("Lua chon tinh nang:");
		System.out.println("1. Cong");
		System.out.println("2. Tru");
		System.out.println("3. Ket thuc");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap lua chon cua ban:");
		int input = scanner.nextInt();
		scanner.close();
		switch (input) {
		case 1: {
			System.out.println("Ban da chon phep Cong");
			break;
		}
		case 2: {
			System.out.println("Ban da chon phep Tru");
			break;
		}
		default:
			System.out.println("Ket thuc");
			System.exit(0);
		}
	}
}
