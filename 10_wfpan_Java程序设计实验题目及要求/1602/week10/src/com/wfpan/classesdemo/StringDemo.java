package com.wfpan.classesdemo;

import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
		String str = new String("   abcc,cccc   ");
		/*try {
			String str1 = new String("".getBytes(), "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		String str1 = new String("".toCharArray());
		
		System.out.println(str.concat("defg"));
		System.out.println(str.endsWith("efg")); //false
		System.out.println(str.equals("abc"));
		System.out.println(str=="abc");
		System.out.println(str.equalsIgnoreCase("ABC"));
		System.out.println(str.indexOf('c'));
		System.out.println("".isEmpty());
		System.out.println(str.lastIndexOf("c"));
		System.out.println(str.length());
		System.out.println(str.replace('c', 'e'));
		System.out.println(Arrays.toString(str.split(",")));
		System.out.println(str.startsWith("ab"));
		System.out.println(str.substring(2));
		System.out.println(str.trim());
		System.out.println(new String("abc".getBytes(), 1, 2));
	}

}
