package cn.zmy.day19;

public class Teacher {
	public static void check(int score) throws MyFirstException {
		if (score > 70) {
			System.out.println("passing grades");
		} else {
			throw new MyFirstException("disqualified");
		}
	}
}
