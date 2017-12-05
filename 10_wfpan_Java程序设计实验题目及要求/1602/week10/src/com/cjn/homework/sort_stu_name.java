package com.cjn.homework;

import java.util.Arrays;
import java.util.Scanner;

public class sort_stu_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stuName = new String[10];
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			stuName[i] = in.nextLine();
		}
		Arrays.sort(stuName,String.CASE_INSENSITIVE_ORDER);
		System.out.println("ÅÅÐòºó£º");
		for(int i = 0; i < 10; i++) {
			System.out.println(stuName[i]);
		}
		
	}

}
