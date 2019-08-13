package cn.zmy.day24.itcast_03;

public class RollarCoaster {
	private static RollarCoaster rc = null;
	
	private RollarCoaster() {}
	
	public static synchronized RollarCoaster getRC() {
		if (rc == null) {
			rc = new RollarCoaster();
		}
		return rc;
	}
}
