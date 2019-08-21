package cn.zmy.day24.Thread.itcast_12;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimeTask extends TimerTask {
	private Timer t;
	
	public MyTimeTask() {}
	
	public MyTimeTask(Timer t) {
		this.t = t;
	}
	
	@Override
	public void run() {
		System.out.println("exploded");
		// terminates this timer
		t.cancel();
	}
}
