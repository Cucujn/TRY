package com.wfpan.classesdemo;

import java.util.Scanner;

public class MathDemo {
	public static void main(String[] args) {
		String[] gifts = {"iphone","Thinkpad","benech","audi"};
		//double [0,1) *4 int [0,4)  [2,3)
		Scanner sc = new Scanner(System.in);
		while(-1!=sc.nextInt())
			System.out.println(gifts[(int)(Math.random()*4)]);
	}
}
