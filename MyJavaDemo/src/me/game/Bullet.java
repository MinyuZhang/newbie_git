package me.game;

public class Bullet extends FlyingObject {
	private int speed = 5;
	private boolean bomb;
	
	public Bullet(int x, int y) {
		this.x = x;
		this.y = y;
		this.image = ShootGame.bullet;
	}
	public void setBomb(boolean bomb) {
		this.bomb = bomb;
	}
	public boolean isBomb() {
		return this.bomb;
	}
	@Override
	public void step() {
		y -= speed;
	}
	@Override
	public boolean outOfBounds() {
		return this.y <= -this.height;
	}
	
}
