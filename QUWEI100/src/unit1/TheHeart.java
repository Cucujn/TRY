package unit1;
import java.awt.*;
import java.applet.*;

public class TheHeart extends Applet {
	int width,height;
	Image image;
	Graphics g1;
	public void init() {
		setBackground(Color.black);//设置背景
		this.setSize(350,310);
		
		width=getSize().width;   //设置窗口宽度
		height=getSize().height;
		image=createImage(width,height);//设置图像对象
		g1=image.getGraphics();
	}
	public void paint(Graphics g) {
		g1.clearRect(0, 0, width, height);
		g1.setColor(Color.red);
		int i,j;
		double x,y,r;
		for(i=0;i<=90;i++) {
			for(j=0;j<=90;j++) {
				//转换为直角坐标
				r=Math.PI/45*i*(1-Math.sin(Math.PI/45*j))*18;
				x=r*Math.cos(Math.PI/45*j)*Math.sin(Math.PI/45*i)+width/2;
				y=-r*Math.sin(Math.PI/45*j)+height/4;
				
				g1.fillOval((int)x,(int) y, 2, 2);
				g1.fillRect((int)x,(int) y, 1, 1);
			}
			g.drawImage(image, 0, 0, this);
		}
	}

}
