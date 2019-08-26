package cn.zmy.day24.Thread.itcast_03;

public class SetThread implements Runnable {
	private Student student;
	
	public SetThread(Student student) {
		this.student = student;
	}
	@Override
	public void run() {
		this.student.setName("张敏宇");
		this.student.setAge(23);
	}

}
