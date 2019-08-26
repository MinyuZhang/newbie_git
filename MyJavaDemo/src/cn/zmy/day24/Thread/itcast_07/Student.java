package cn.zmy.day24.Thread.itcast_07;

import java.util.Calendar;

public class Student {
	private String name;
	private int age;
	private boolean flag;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public synchronized void set(String name, int age) {
		if (this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.setName(name);
		this.setAge(age);
		this.setFlag(false);
		this.notify();
	}
	
	public synchronized void get() {
		if (!this.isFlag()) {
			try {
				this.wait();;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.getName() + "|" + this.getAge());
		this.setFlag(true);
		this.notify();
	}
	public static void main(String[] args) {
		System.out.println(Calendar.getInstance().getTimeInMillis());
	}
}
