package com.cjn.homework;

import java.util.Scanner;

public class No5 {
	public static int getPopularElement(int[] a) {
		if(a.length<2) {
			return a[0];
		}
		int t[] = new int[a.length];
		int popular = -1;
		for(int i = 0; i<a.length;i++) {
			int temp = a[i];
			int count = 1;
			for(int j=0;j<a.length;j++) {
				if(j==i) {
					continue;
				}
				if(temp == a[j]) {
					count++;
				}
			}
			t[i] = count;
		}
		int flag=-1, max=0;
		for(int i=0;i<t.length;i++) {
			if(t[i]>max) {
				max = t[i];
				flag = i;
			}
		}
		return a[flag];
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������Ҫ���������������");
		int n = in.nextInt();
		int[] number = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("�������"+(i+1)+"��������");
			number[i] = in.nextInt();
		}
		int popular = getPopularElement(number);
		System.out.println("���ִ�����������Ϊ��"+popular);
		
	}
	
}
