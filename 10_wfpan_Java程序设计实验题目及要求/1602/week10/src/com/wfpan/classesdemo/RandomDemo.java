package com.wfpan.classesdemo;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random rnd = new Random();
		int i = 1 + rnd.nextInt(4); //1-5
	}
}
