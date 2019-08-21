package cn.zmy.day24.Thread.itcast_04;

public class GetThread implements Runnable {
	private Student student;
	private int index = 0;
	
	public GetThread(Student student) {
		this.student = student;
	}
	
	@Override
	public void run() {
		while (true) {
			synchronized (student) {
				if (index >= 100) {
					System.out.println("over");
					break;
				} else {
					System.out.println(this.student.getName() + "--" + this.student.getAge());
				}
				index ++;
			}
		}
	}
	
}
