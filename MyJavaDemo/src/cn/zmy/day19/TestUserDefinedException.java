package cn.zmy.day19;

public class TestUserDefinedException {
	public static void main(String[] args) {
		int score = 60;
		try {
			Teacher.check(score);
		} catch (MyFirstException e) {
			e.printStackTrace();
		}
	}
}
