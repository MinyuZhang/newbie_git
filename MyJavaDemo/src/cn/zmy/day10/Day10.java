package cn.zmy.day10;

public class Day10 {
	public static void main(String[] args) {
		People p = new BasketballPlayer();
		p.setAge(20);
		p.setName("张敏宇");

		p.showInterests();
		p.eat();
		System.out.println(p);
		
		System.out.println("-----------------------");
		
		People p2 = new BasketballCoach("Sally", 22);
		System.out.println(p2);
		if (p2 instanceof Coach) {
			Coach p22 = (Coach)p2;
			p22.teach();
			p22.showInterests();
		}
		
	}
}
