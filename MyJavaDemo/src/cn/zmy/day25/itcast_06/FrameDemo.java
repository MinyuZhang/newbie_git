package cn.zmy.day25.itcast_06;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("鼠标的移入移出");
		
		f.setBounds(800, 100, 500, 200);
		
		f.setLayout(new FlowLayout());
		// 添加监听器
		f.addWindowListener(new WindowAdapter() {
			// 设置窗体可被关闭
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		Button redBtn = new Button("red");
		Button yellowBtn = new Button("yellow");
		Button cyanBtn = new Button("cyan");
		
		f.add(redBtn);
		f.add(yellowBtn);
		f.add(cyanBtn);
		
		// 对按钮添加鼠标的进入事件
		redBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				redBtn.setBackground(Color.RED);
			}
		});
		redBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				redBtn.setBackground(Color.WHITE);
			}
		});
		yellowBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				yellowBtn.setBackground(Color.YELLOW);
			}
		});
		yellowBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				yellowBtn.setBackground(Color.WHITE);
			}
		});
		cyanBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				cyanBtn.setBackground(Color.CYAN);
			}
		});
		cyanBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				cyanBtn.setBackground(Color.WHITE);
			}
		});
		f.setVisible(true);
	}
}
