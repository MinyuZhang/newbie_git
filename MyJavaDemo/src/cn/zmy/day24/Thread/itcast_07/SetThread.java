package cn.zmy.day24.Thread.itcast_07;

public class SetThread implements Runnable {
	private Student s;
	private int x;
	
	public SetThread(Student s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		while(true) {
			if (x % 3 == 0) {
				s.set("张敏宇", 23);
			} else if(x % 3 == 1) {
				s.set("东方不败", 24);
			} else {
				s.set("齐天大圣", 18);
			}
			x ++;
		}
	}
	
}
