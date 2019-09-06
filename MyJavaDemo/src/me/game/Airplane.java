package me.game;

public class Airplane extends FlyingObject implements Enemy {
	
	private static final int speed = 2;
	
	// 敌机的构造函数
	public Airplane() {
		this.x = (int)(Math.random()*(ShootGame.WIDTH - ShootGame.airplane.getWidth()));
		this.y = -this.height;
		this.image = ShootGame.airplane;
		this.ember = ShootGame.air_ember;
	}
	// 敌机从上往下移动
	@Override
	public void step() {
		this.y += speed;
	}
	// 是否越界的判断
	public boolean outOfBounds() {
		return this.y > ShootGame.HEIGHT;
	}
	public int getScore() {
		return 5;
	}
}
