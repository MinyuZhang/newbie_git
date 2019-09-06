package me.game;

public class Bigplane extends FlyingObject implements Enemy {

	private static final int speed = 3;

	public Bigplane() {
		this.x = (int)(Math.random()*(ShootGame.WIDTH - ShootGame.bigplane.getWidth()));
		this.y = -this.height;
		this.image = ShootGame.bigplane;
		this.ember = ShootGame.big_ember;
	}
	@Override
	public void step() {
		this.y += speed;
	}

	@Override
	public boolean outOfBounds() {
		return this.y > ShootGame.HEIGHT;
	}
	public int getScore() {
		return 10;
	}

}
