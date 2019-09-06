package me.game;

public interface Award {
	// 双倍火力
	public static int PENTA_FIRE = 0;
	// 一条生命
	public static int LIFE = 1;
	// 获取奖励类型：双倍火力或者一条生命
	public int getType();
}
