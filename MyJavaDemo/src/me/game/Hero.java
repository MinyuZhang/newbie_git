package me.game;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Hero extends FlyingObject {
	protected BufferedImage []images;
//	private int double_fire = 20;
	private int penta_fire = 20;
	private int life;
	private int index = 0;
	
	public Hero() {
		this.life = 3;
		this.image = ShootGame.hero0;
		this.ember = ShootGame.hero_ember;
		this.x = 150;
		this.y = 400;
		this.width = ShootGame.hero0.getWidth();
		this.height = ShootGame.hero0.getHeight();
		images = new BufferedImage[]{ShootGame.hero0, ShootGame.hero1};
	}
	public int getPentaFire() {
		return penta_fire;
	}
	public BufferedImage[] getImages() {
		return images;
	}
	public void addLife() {
		this.life ++;
	}
	public void subtractLife() {
		this.life --;
	}
	public void addPentaFire() {
		this.penta_fire += 40;
	}
	public void clearPentaFire() {
		this.penta_fire = 0;
	}
	@Override
	public void step() {
		if(images.length>0){
			this.image = images[index ++ % 10 / 5];
		}
	}
	public int getLife() {
		return life;
	}
	// 英雄机移动的位置与鼠标所在的位置有关
	public void moveTo(int x, int y) {
		this.x = x - this.width/2;
		this.y = y - this.height/2;
	}
	// 发射子弹
	public List<Bullet> shoot() {
		int xStep = this.width / 6;
		int yStep = 20;
		if (this.penta_fire > 0) {
			List<Bullet> bul = new ArrayList<Bullet>();
			bul.add(new Bullet(this.x + xStep, this.y - yStep));
			bul.add(new Bullet(this.x + 2*xStep, this.y - yStep));
			bul.add(new Bullet(this.x + 3*xStep, this.y - yStep));
			bul.add(new Bullet(this.x + 4*xStep, this.y - yStep));
			bul.add(new Bullet(this.x + 5*xStep, this.y - yStep));
			this.penta_fire -= 5;
			return bul;
		} else {
			List<Bullet> bul = new ArrayList<Bullet>();
			bul.add(new Bullet(this.x + 2*xStep, this.y - yStep));
			return bul;
		}
	}
	@Override
	public boolean outOfBounds() {
		return false;
	}
	public boolean isHit(FlyingObject obj) {
		int x1 = obj.x - this.width/2;
		int x2 = obj.x + obj.width + this.width/2;
		int y1 = obj.y - this.height/2;
		int y2 = obj.y + obj.height + this.height/2;
		
		return this.x > x1 && this.x < x2 && this.y > y1 && this.y < y2;
	}
}
