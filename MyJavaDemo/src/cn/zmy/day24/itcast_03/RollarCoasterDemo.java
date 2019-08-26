package cn.zmy.day24.itcast_03;

public class RollarCoasterDemo {
	public static void main(String[] args) {
		RollarCoaster rc1 = RollarCoaster.getRC();
		RollarCoaster rc2 = RollarCoaster.getRC();
		System.out.println(rc1);
		System.out.println(rc1 == rc2);
	}
}
