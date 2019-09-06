package me.game;

import java.awt.image.BufferedImage;

public abstract class FlyingObject {
	// 飞行物的位置、长宽
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected BufferedImage image;
	protected BufferedImage []ember;
	
	public FlyingObject() {
	}
	// 英雄机、子弹的位置不固定，动态变化
	// 飞行物的运动
	public abstract void step();
	// 飞行物越界的判断
	public abstract boolean outOfBounds();
	
	public BufferedImage getImage() {
		return image;
	}
	// 判断飞行物是否相撞
	public boolean isHit(FlyingObject f) {//bullet.isHit(fly)
		int x1 = f.getX() - this.getWidth();
		int x2 = f.getX() + f.getWidth();
		int y1 = f.getY() + f.getHeight();
		int y2 = f.getY() - this.getHeight();
		return this.x < x2 && this.x > x1 && this.y < y1 && this.y > y2;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return this.image.getWidth();
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return this.image.getHeight();
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public BufferedImage[] getEmber() {
		return ember;
	}
	public void setEmber(BufferedImage[] ember) {
		this.ember = ember;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	public static void main(String[] args) {
	}
}
