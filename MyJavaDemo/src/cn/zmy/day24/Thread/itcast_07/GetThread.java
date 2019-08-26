package cn.zmy.day24.Thread.itcast_07;

public class GetThread implements Runnable {
	private Student s;
	
	public GetThread(Student s) {
		this.s = s;
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(s.getName() + "|" + s.getAge());
		}
	}

}
