package unit2;

import java.util.Scanner;

public class GeRenShui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入工资");
		Scanner input = new Scanner(System.in);
		double sr= input.nextDouble();
		System.out.println("应交个人所得税："+getTax(sr));

	}
	public static double getTax(double sal) {
		double t=0;
		double b=sal-3500;
		if(b<=500) {
			t=b*0.05;
			return t;
		}
		else if(b<=2000&&b>500) {
			t=25+(b-500)*0.1;
			return t;
		}
		else if (b<=5000&&b>2000) {
			t=175+(b-2000)*0.15;
			return t;
			
		}
		else if (b<=20000&&b>5000) {
			t=625+(b-5000)*0.2;
			return t;
			
		}
		else if (b<=40000&&b>20000) {
			t=3625+(b-20000)*0.25;
			return t;
			
		}
		else if (b<=60000&&b>40000) {
			t=8625+(b-40000)*0.3;
			return t;
			
		}
		else if (b<=80000&&b>60000) {
			t=14625+(b-60000)*0.35;
			return t;
			
		}
		else if (b<=10000&&b>80000) {
			t=21625+(b-80000)*0.4;
			return t;
			
		}
		else {
			t=29625+(b-100000)*0.45;
			return t;
		}
		
	}

}
