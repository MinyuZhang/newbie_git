package cn.zmy.day24.Thread.itcast_05;

public class GetThread implements Runnable {
	private Student s;
	
	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if(!s.isFlag()){
					try {
						s.wait(); //t2就等待了。立即释放锁。将来醒过来的时候，是从这里醒过来的时候
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(s.getName() + "---" + s.getAge());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//林青霞---27
				//刘意---30
				
				//修改标记
				s.setFlag(false);
				//唤醒线程
				s.notify(); //唤醒t1
			}
		}
	}
}
