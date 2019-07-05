package cn.zmy.day09;

/**
 * 会跳高的猫
 * @author zmy
 *
 */
public class JumpCat extends Cat implements Jump {
	
	public JumpCat() {}
	
	public JumpCat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void jump() {
		System.out.println("跳高猫");
	}
	
}
