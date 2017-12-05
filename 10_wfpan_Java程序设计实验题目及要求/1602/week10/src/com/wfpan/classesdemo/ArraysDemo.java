package com.wfpan.classesdemo;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] score = {1,3,8,4,10,6,7,2,9};
		Student[] stu = new Student[] {
				new Student("hua", 12, "nv"),
				new Student("feng",18,"nan")
		};
		Arrays.sort(score);
		System.out.println(Arrays.binarySearch(score, 9));
		Arrays.fill(score, 0);
		System.out.println(score);
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(stu));
	}

}
