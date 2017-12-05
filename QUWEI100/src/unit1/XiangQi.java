package unit1;
import java.awt.Color;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class XiangQi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("创建国际象棋");
		f.setSize(168, 195);//设置窗口大小
		//窗口设置位置
		Point point=new Point(350,200);
		f.setLocation(point);
		
		int grids=8;int gridsize=20;
		for(int i=0;i<grids;i++) {
			for(int j=0;j<grids;j++) {
				JLabel l =new JLabel();
				l.setSize(gridsize,gridsize);
				l.setLocation(i*gridsize,j*gridsize);
				if((i+j)%2==0) {
					l.setBackground(Color.BLACK);
					l.setOpaque(true);
				}
				else {
					l.setBackground(Color.white);
					l.setOpaque(true);
				}
				l.setBorder(BorderFactory.createLineBorder(Color.black));
				
				f.add(l);
			}
		}
		f.setVisible(true);
	}

}
