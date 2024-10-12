package helloworld;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
//		- duoi 10M khong dong thue
//		- 10M - 15M thue 10%
//		- 15M - 30M thue 20%
		Scanner scanner = new Scanner(System.in);
//		- > 30M thue 50%

		System.out.println("Nhap vao so tien: ");
		int money = scanner.nextInt();

		if (money < 10000000 && money >= 0) {
			System.out.println("Khong dong thue");
		} else if (money >= 10000000 && money <= 15000000) {
			System.out.println("Thue 10%");
		} else if (money > 15000000 && money <= 30000000) {
			System.out.println("Thue 20%");
		} else if (money > 30000000) {
			System.out.println("Thue 50%");
		} else {
			System.out.println("So tien nhap vao khong hop le");
		}
		scanner.close();
	}
}
