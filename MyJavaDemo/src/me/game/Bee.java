package me.game;

import java.util.Random;

public class Bee extends FlyingObject implements Award {
	private int awardType;
	private int ySpeed = 2;
	private int xSpeed = 2;
	
	public Bee() {
		this.x = new Random().nextInt(ShootGame.WIDTH - ShootGame.bee.getWidth());
		this.y = -this.height;
		this.image = ShootGame.bee;
		this.ember = ShootGame.bee_ember;
		this.awardType = (int)(Math.random()*2);
	}
	@Override
	public int getType() {
		return awardType;
	}

	@Override
	public void step() {
		this.y += this.ySpeed;
		this.x += this.xSpeed;
		if (this.x >= (ShootGame.WIDTH  - ShootGame.bee.getWidth())) {
			this.xSpeed = -2;
		} else if (this.x <= 0) {
			this.xSpeed = 2;
		}
	}

	@Override
	public boolean outOfBounds() {
		return this.y > ShootGame.HEIGHT;
	}
	public static void main(String[] args) {
//		System.out.println(new Bee().getImage().getWidth() + ":" + ShootGame.bee.getWidth() + ":" + ShootGame.WIDTH);
		System.out.println(new Bee().awardType);
	}
}
