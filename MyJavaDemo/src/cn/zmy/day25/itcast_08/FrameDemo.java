package cn.zmy.day25.itcast_08;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 一级菜单
 */
public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("一级菜单");
		
		f.setBounds(500, 500, 400, 400);
		f.setLayout(new FlowLayout());
		// 设置窗体关闭
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// 创建菜单栏
		MenuBar mb = new MenuBar();
		// 创建菜单
		Menu m = new Menu("file");
		// 创建菜单项
		MenuItem mi = new MenuItem("exit");
		m.add(mi);
		mb.add(m);
		mi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		f.setMenuBar(mb);
		// 设置窗体可见
		f.setVisible(true);
	}
}
