package cn.zmy.day25.itcast_05;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("数据转移");
		// 设置窗体属性和布局
		f.setBounds(500, 100, 600, 600);
		f.setLayout(new FlowLayout());
		Button b = new Button("press me");
		// 创建文本框
		final TextField tf = new TextField("Hell applet");
		// 创建文本域
		final TextArea ta = new TextArea(10, 40);
		f.add(b);
		f.add(tf);
		f.add(ta);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取文本框的值
				String str = tf.getText().trim();
				// 清空文本框中的值
				tf.setText("");
				ta.append(str + "\r\f");
				tf.requestFocus();
			}
		});
		f.setVisible(true);
	}
}
