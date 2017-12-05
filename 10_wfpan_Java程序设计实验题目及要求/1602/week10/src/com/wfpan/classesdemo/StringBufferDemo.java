package com.wfpan.classesdemo;

public class StringBufferDemo {
	//缓存 = 带数组的一个String
	public static void main(String[] args) {
		String a = "1";
		for(int i = 2; i<10000;i++) {
			a += i; //12 123 1234 12345 123456
		}
		//几点对象？ 9 String sb
		StringBuffer sb =null;
	}
}
