package cn.zmy.day24.Thread.itcast_03;

public class GetThread implements Runnable {
	private Student student;
	
	public GetThread(Student student) {
		this.student = student;
	}
	
	@Override
	public void run() {
		System.out.println(this.student.getName() + "--" + this.student.getAge());
	}
	
}
