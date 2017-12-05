package com.wfpan.classesdemo;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (0 != sc.nextInt()) {
			System.out.println(sc.nextInt());
			System.out.println(sc.nextFloat());
			System.out.println(sc.nextDouble());
			System.out.println(sc.nextBoolean());
			System.out.println(sc.nextShort());
		}

	}
}
