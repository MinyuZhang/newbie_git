package cn.zmy.day24.Thread.itcast_02;

public class DieLock extends Thread {
	private boolean flag;
	
	public DieLock(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		if (flag) {
			synchronized (MyLock.objA) {
				System.out.println("objA");
				synchronized (MyLock.objB) {
					System.out.println("objB");
				}
			}
		} else {
			synchronized (MyLock.objB) {
				System.out.println("objB");
				synchronized (MyLock.objA) {
					System.out.println("objA");
				}
			}
		}
	}

}
