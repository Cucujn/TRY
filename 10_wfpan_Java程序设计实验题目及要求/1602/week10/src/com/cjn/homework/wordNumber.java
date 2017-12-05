package com.cjn.homework;

public class wordNumber {
	public static void main(String[] args) {
	String str = "Hello!Hello!I am 01.What is your name?";
	String newStr;
	char c = str.charAt(str.length()-1);
	if(!((c>=65&&c<=90)||(c>=97&&c<=125))) {
		newStr=str.substring(0, str.length()-1);
		count(newStr);
	}else {
		count(str);
	}
}
	public static void count(String str) {
		int count=0;
		String str1 = str;
		String s[] = str1.split(" |,|\\?|\\.");
		for(int i=0;i<s.length;i++) {
	               count++;//计数变量
	          } 
	         System.out.println("这段话共有"+count+"单词");
	}
}
