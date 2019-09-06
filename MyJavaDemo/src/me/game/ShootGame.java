package me.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShootGame extends JPanel {
	private static final long serialVersionUID = -1235678987654321L;
	
	// 游戏界面的宽高
	public static final int WIDTH = 400;
	public static final int HEIGHT = 650;
	// 游戏当前的状态
	private int state;
	// 游戏初始的分值
	private int score = 0;
	// 游戏刷新间隔
	private int interval = 10;
	// 飞行物入场计数
	private int enterIndex = 0;
	// 控制子弹数目之索引
	private int shootIndex = 0;
	
	// 游戏的四种状态
	public static final int START = 0;
	public static final int RUNNING = 1;
	public static final int PAUSE = 2;
	public static final int GAME_OVER = 3;
	
	public static BufferedImage background;
	public static BufferedImage start;
	public static BufferedImage pause;
	public static BufferedImage game_over;
	public static BufferedImage airplane;
	public static BufferedImage []air_ember = new BufferedImage[4];
	public static BufferedImage bigplane;
	public static BufferedImage []big_ember = new BufferedImage[4];
	public static BufferedImage bee;
	public static BufferedImage []bee_ember = new BufferedImage[4];
	public static BufferedImage bullet;
	public static BufferedImage hero0;
	public static BufferedImage hero1;
	public static BufferedImage []hero_ember = new BufferedImage[4];
	public static Class<ShootGame> cls = ShootGame.class;
	
	// 敌机集合
	private List<FlyingObject> flyings = new ArrayList<FlyingObject>();
	private Hero hero = new Hero();
	// 子弹集合
	private List<Bullet> bullets = new ArrayList<Bullet>();
	private List<Ember> embers = new ArrayList<Ember>();
	
	static {
		try {
			background = ImageIO.read(cls.getResource("resource/background.png"));
			start = ImageIO.read(cls.getResource("resource/start.png"));
			pause = ImageIO.read(cls.getResource("resource/pause.png"));
			game_over = ImageIO.read(cls.getResource("resource/gameover.png"));
			hero0 = ImageIO.read(cls.getResource("resource/hero0.png"));
			hero1 = ImageIO.read(cls.getResource("resource/hero1.png"));
			airplane = ImageIO.read(cls.getResource("resource/airplane.png"));
			bigplane = ImageIO.read(cls.getResource("resource/bigplane.png"));
			bullet = ImageIO.read(cls.getResource("resource/bullet.png"));
			bee = ImageIO.read(cls.getResource("resource/bee.png"));
			for (int i = 0; i < 4; i ++ ) {
				air_ember[i] = ImageIO.read(cls.getResource("resource/airplane_ember" + i + ".png"));
				big_ember[i] = ImageIO.read(cls.getResource("resource/bigplane_ember" + i + ".png"));
				bee_ember[i] = ImageIO.read(cls.getResource("resource/bee_ember" + i + ".png"));
				hero_ember[i] = ImageIO.read(cls.getResource("resource/hero_ember" + i + ".png"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 *画笔，用于画各种飞行物以及英雄机
	 */
	@Override
	public void paint(Graphics g) {
		// 画背景图
		g.drawImage(background, 0, 0, null);
		g.drawImage(hero.image, hero.getX(), hero.getY(), null);// 绘制英雄机
		paintFlyingObjects(g);// 画各种飞行物
		paintEmbers(g);// 画灰烬
		paintBullets(g); // 画子弹
		paintScore(g); // 画分数
		paintState(g); // 画游戏状态
	}
	public void paintFlyingObjects(Graphics g) {
		for(int i = 0; i < flyings.size(); i ++) {
			FlyingObject f = flyings.get(i);
			g.drawImage(f.getImage(), f.getX(), f.getY(), null);
		}
	}
	public void paintEmbers(Graphics g) {
		for (int i = 0; i < embers.size(); i ++) {
			Ember e = embers.get(i);
			g.drawImage(e.getImage(), e.getX(), e.getY(), null);
		}
	}
	public void paintBullets(Graphics g) {
		for (int i = 0; i < bullets.size(); i ++) {
			Bullet bul = bullets.get(i);
			if (!bul.isBomb()) {
				g.drawImage(bul.getImage(), bul.getX(), bul.getY(), null);
			}
		}
	}
	public void paintScore(Graphics g) {
		int x = 10;
		int y = 25;
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 14);
		g.setFont(font);
		Color color = new Color(150);
		g.setColor(color);
		g.drawString("LIFE: " + hero.getLife(), x, y);
		g.drawString("SCORE: " + score, x, y + 20);
		g.drawString("DOUBLE_FIRE: " + hero.getPentaFire(), x, y + 40);
		
	}
	public void paintState(Graphics g) {
		switch(state) {
		case START:
			g.drawImage(start, 0, 0, null);
			break;
		case PAUSE:
			g.drawImage(pause, 0, 0, null);
			break;
		case GAME_OVER:
			g.drawImage(game_over, 0, 0, null);
			break;
		}
	}
	// 游戏开始
	public void action() {
		MouseAdapter l = new MouseAdapter() {
			// 英雄机随着鼠标的移动而移动
			public void mouseEntered(MouseEvent e) {
				if (state == PAUSE) {
					state = RUNNING;
				}
			}
			public void mouseExited(MouseEvent e) {
				if (state == RUNNING) {
					state = PAUSE;
				} else if (state == PAUSE) {
					state = RUNNING;
				}
			}
			@Override
			public void mouseMoved(MouseEvent e) {
				if (state == RUNNING) {
					int x = e.getX();// 获取鼠标的横坐标
					int y = e.getY();// 获取鼠标的纵坐标
					hero.moveTo(x, y);// 英雄机随着鼠标移动而移动
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switch(state) {
				case START:
					state = RUNNING;
					break;
				case GAME_OVER:
					flyings = new ArrayList<FlyingObject>();
					hero = new Hero();
					bullets = new ArrayList<Bullet>();
					score = 0;
					state = START;
					break;
				}
			}
			
		};
		// 处理鼠标点击操作
		this.addMouseListener(l);
		// 处理鼠标滑动操作
		this.addMouseMotionListener(l);
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				// 游戏运行状态时绘制图片
				if (state == RUNNING) {
					enterAction();// 飞行物入场
					stepAction();// 移动
					shootAction();// 射击
					shootByBulletsAction();// 子弹与飞行物的碰撞检测
					heroHitAction();// 英雄机与飞行物的碰撞检测
				}
				repaint();
			}
		}, interval, interval);
	}
	public void heroHitAction () {
		for (int i = 0; i < flyings.size(); i ++) {
			FlyingObject f = flyings.get(i);
			if (f.isHit(hero)) {
				int life = hero.getLife();
				if (life <= 0) {
					state = GAME_OVER;
				} else {
					// 英雄机与敌方飞行物相撞
					// 英雄机减命、清空火力值
					hero.subtractLife();
					hero.clearPentaFire();
					flyings.remove(i);
					-- i;
				}
			}
		}
	}
	public void shootByBulletsAction() {
		for (int j = 0; j < bullets.size(); j ++) {
			Bullet b = bullets.get(j);
			for (int i = 0; i < flyings.size(); i ++) {
				FlyingObject f = flyings.get(i);
				if (b.isHit(f)) {
					b.setBomb(true);// 子弹击中敌机
					bullets.remove(j);
					flyings.remove(i);
					-- j;
					-- i;
					// 击中小飞机、大飞机：奖励分数
					if (f instanceof Enemy) {
						Enemy enemy = (Enemy)f;
						score += enemy.getScore();
						
					} else if (f instanceof Award) {
						// 击中小蜜蜂：奖励一条命或者双倍火力值
						Award award = (Award)f;
						switch(award.getType()) {
						case Award.LIFE:
							hero.addLife();
							break;
						case Award.PENTA_FIRE:
							hero.addPentaFire();;
							break;
						}
					}
				}
			}
		}
	}
	public void shootAction() {
		if (shootIndex++%20 == 0) {
			bullets.addAll(hero.shoot());
		}
	}
	/**
	 * 飞行物移动
	 */
	public void stepAction() {
		for (int i = 0 ; i < flyings.size(); i ++) {
			FlyingObject f = flyings.get(i);
			f.step();
		}
		for(int i = 0; i < bullets.size(); i ++) {
			Bullet bul = bullets.get(i);
			bul.step();
		}
		hero.step();
	}
	public void enterAction() {
		// 每三百毫秒随机产生一个飞行物
		if (enterIndex ++ % 30 == 0) {
			flyings.add(nextOne());
		}
	}
	public FlyingObject nextOne() {
		Random rand = new Random();
		int type = rand.nextInt(20);
		if (type <= 2) {
			return new Bee();
		} else if (type <=10) {
			return new Airplane();
		} else {
			return new Bigplane();
		}
	}
	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame("Shoot Game");
		ShootGame game = new ShootGame(); // 面板对象
		frame.add(game);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 关闭窗口
		frame.setVisible(true);
		game.action();
	}
}
