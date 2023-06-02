package test01.com.test0101;

import java.util.Scanner;

public class test0101 {
	public void count() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("입력 : ");
			String str = sc.nextLine();
			if (str.equals("exit")) {
				break;
			} else {
				System.out.println(str.length() + "글자");
			}
		}
		System.out.println("프종");
	}

	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력");
		int num = sc.nextInt();

		if (num >= 1 && num <= 10) {
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 1) {
					System.out.println(i + " ");
				}
			}
		} else {
			System.out.println("아님");
		}

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1.이상");
		int num = sc.nextInt();

		int sum = 0;

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("1 부터" + num + "까지의 합" + sum + "임");
		} else {
			System.out.println("1이상이 아닙");
		}
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상");
		int num = sc.nextInt();

		int sum = 0;

		if (num > 0) {
			int i = 1;
			while (i <= num) {
				sum += i;
				i++;
			}
			System.out.println("1 부터" + num + "까지의 합" + sum + "임");
		} else {
			System.out.println("1이상이 아닙");
		}

	}
}
