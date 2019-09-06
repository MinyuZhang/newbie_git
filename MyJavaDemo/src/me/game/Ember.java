package me.game;

import java.awt.image.BufferedImage;

public class Ember {
	private BufferedImage []images;
	private BufferedImage img;
	private int interval = 10;
	private int x;
	private int y;
	private int index;
	private int i;
	
	public Ember(FlyingObject obj) {
		images = obj.ember;
		img = obj.image;
		this.x = obj.x;
		this.y = obj.y;
		this.i = 0;
	}
	public boolean burnDown() {
		i ++;
		/**
		 * 灰烬没有燃尽
		 */
		if (i%10 == 0) {
			if (index == images.length) {
				return true;
			}
			img = images[index ++];
		}
		return false;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public BufferedImage getImage() {
		return this.img;
	}
}
