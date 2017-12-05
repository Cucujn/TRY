package com.cjn.homework;

import java.util.Scanner;

public class gift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] gifts = {"ipone","ipad","iwatch","iphone8"};
		Scanner in = new Scanner(System.in);
		int m = -1;
		while(-1!=in.nextInt()) {
			m = (int)(Math.random()*4);
			System.out.println(gifts[m]);
			gifts[m] = null;
		}

}
}
