package com.cjn.homework;

import java.util.Scanner;

public class comaprestr {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		int count = getSubString(str1,str2);
		System.out.println("�ַ���2���ַ���1�г��ֵĴ���Ϊ��"+count+"�Ρ�");
	}

	private static int getSubString(String str1,String str2) {
		int count = 0;
		int index = 0;
//	     * @param   fromIndex   the index from which to start the search.
//	     * @return  the index of the first occurrence of the specified substring,
//	     *          starting at the specified index
		while((index=str1.indexOf(str2, index))!=-1) {
			index = index +str2.length();
			count++;
		}
		return count;
	}
}
