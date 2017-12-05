package com.cjn.homework;

import java.util.Arrays;
import java.util.Scanner;

public class classdemo {
	student[] stu = new student[3];
	String classname;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		classdemo ruanjian = new classdemo();
		ruanjian.classname = in.nextLine();
		System.out.println("班级名称为"+ruanjian.classname);
		
		String[] stuname = new String[3];
		for(int i = 0; i<3;i++) {
			stuname[i] = in.nextLine();
		}
		Arrays.sort(stuname,String.CASE_INSENSITIVE_ORDER);
		System.out.println("排序后");
		for(int j = 0;j<3;j++) {
			System.out.println(stuname[j]);
		}
		
	}
}
