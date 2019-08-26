package cn.zmy.day25.itcast_04;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 需求：把按钮添加到窗体，并对按钮添加一个点击事件。
 * A：创建窗体对象
 * B:创建按钮对象
 * C:把按钮添加到窗体
 * D:窗体显示
 */
public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("为窗体添加按钮");
		f.setBounds(500, 150, 600, 500);
		/**
		 * Sets the layout manager for this container.
		 * This method changes layout-related information, and therefore,
		 * invalidates the component hierarchy.
		 */
		f.setLayout(new FlowLayout());
		// 创建按钮对象
		Button b1 = new Button("press me");
		b1.setBackground(Color.cyan);
		
		// 添加按钮至窗体对象
		f.add(b1);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("press again");
			}
		});;
		f.setVisible(true);
	}
}
