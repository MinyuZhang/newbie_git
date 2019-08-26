package cn.zmy.day25.itcast_02;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		Frame f = new Frame("窗体关闭示例");
		// 创建窗体尺寸位置
		f.setBounds(500, 200, 400, 400);
		
		// 让窗体关闭
		// 事件源
		// 事件：对窗体的处理
		// 事件处理：关闭窗口(System.exit(0));
		// 事件监听
		f.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// 关闭窗体
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		f.setVisible(true);
		// 适配器实现窗体关闭
//		frameDemo();
	}
	public static void frameDemo() {
		Frame f = new Frame("窗体关闭（适配器）");
		// 设置窗体的位置、尺寸
		f.setBounds(500, 200, 500, 500);
		// 设置窗体可见
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(0);
			}
			
		});
		f.setVisible(true);
	}
}
