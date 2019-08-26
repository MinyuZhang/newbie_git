package cn.zmy.day25.itcast_07;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 你输入的如果是非数字字符，就取消你键盘录入的效果。
 */
public class FrameDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		Frame f = new Frame("输入QQ号码");
		f.setBounds(600, 200, 500, 500);
		// 设置布局
		f.setLayout(new FlowLayout());
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// 创建label标签对象
		Label la = new Label("输入你的QQ号码（只能是数字）");
		TextField tf = new TextField(40);
		f.add(la);
		f.add(tf);
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (!(keyCode <= 57 && keyCode >= 48)) {
					/**
					 * Consumes this event so that it will not be processedin the default manner by the source which originated it.
					 */
					e.consume();
				}
			}
		});
		f.setVisible(true);
	}
}
