package unit2;
import java.text.*;
import java.util.*;

import javax.swing.InputMap;
public class DarkFriday {

	public static void main(String[] args) {
	System.out.println("��������ʼ��ݣ�");
	Scanner input=new Scanner(System.in);
	int year = input.nextInt();
	System.out.println("������������δ�����꣺");
	int n=input.nextInt();
	getBlackFri(year,n);
}
	public static void getBlackFri(int year,int n) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E");
		int k=0;
		Calendar cal = Calendar.getInstance();
		while(k<n) {
			for (int i =0;i<12;i++) {
				cal.set(year, i,13);
				if(5==(cal.get(Calendar.DAY_OF_WEEK)-1)) {
					System.out.println("��ɫ������"+sdf.format(cal.getTime()));
				}
			}
			year++;
			k++;
		}
	}
}
