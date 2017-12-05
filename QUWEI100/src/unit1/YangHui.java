package unit1;
import java.awt.print.Printable;
import java.util.*;
public class YangHui {
	private static int[][] getTriangle(int num) {
		int [][] ary = new int [num][num];
		for(int i=0;i<ary.length;i++) {
			ary[i][0]=1;
			ary[i][i]=1;
		}
		for(int i=1;i<ary.length;i++) {
			for(int j=1;j<=i;j++) {
				ary[i][j]= ary[i-1][j-1]+ary[i-1][j];
			}
		}
		return ary;
	}
	private static void print(int[][] ary) {
		for(int i=0;i<ary.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.printf("   %-3d",ary[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("ÇëÊäÈëÐÐÊý£º");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int [][] ary = getTriangle(num);
		print(ary);
	}
}
