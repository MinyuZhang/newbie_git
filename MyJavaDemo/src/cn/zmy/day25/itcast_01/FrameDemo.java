package cn.zmy.day25.itcast_01;

import java.awt.Frame;

public class FrameDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		Frame f = new Frame("张敏宇");
		// 设置窗体标题
		f.setTitle("Hello Java");
		// 设置窗体大小
		f.setSize(500, 250);
		// 设置窗位置
		f.setLocation(300, 150);
		// 让窗体显示
		f.setVisible(true);
		// 是否允许用户调整窗体大小
		f.setResizable(true);
		f.setFocusable(true);
	}
}
