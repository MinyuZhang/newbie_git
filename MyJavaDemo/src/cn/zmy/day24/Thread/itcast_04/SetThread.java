package cn.zmy.day24.Thread.itcast_04;

public class SetThread implements Runnable {
	private Student student;
	private int index = 0;

	public SetThread(Student student) {
		this.student = student;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (student) {
				System.out.println(index % 2);
				if (index >= 100) {
					System.out.println("over");
					break;
				}
				if (index % 2 == 0) {
					this.student.setName("闪电侠");
					this.student.setAge(23);
				} else {
					this.student.setName("李小龙");
					this.student.setAge(22);
				}
				index++;
			}
		}
	}

}
