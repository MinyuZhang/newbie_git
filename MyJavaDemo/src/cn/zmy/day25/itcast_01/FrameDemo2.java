package cn.zmy.day25.itcast_01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;

public class FrameDemo2 {
	public static void main(String[] args) {
		Frame f = new Frame("方法调用的前后关系");
		
		f.setVisible(true);
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		f.setSize(500, 400);
//		Dimension d = new Dimension(500, 400);
//		f.setSize(d);
//		f.setLocation(500, 500);
//		Point p = new Point(500, 200);
//		f.setLocation(p);
		// Frame.setBounds(position-x, position-y, width, height)
		f.setBounds(500, 250, 500, 400);
	}
}
