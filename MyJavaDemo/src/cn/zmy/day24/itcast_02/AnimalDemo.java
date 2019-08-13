package cn.zmy.day24.itcast_02;

public class AnimalDemo {
	public static void main(String[] args) {
		Factory f = new DoggFactory();
		Factory f2 = new CatsFactory();
		Animal b = f2.createAnimal();
		Animal a = f.createAnimal();
		a.eat();
		b.eat();
	}
}
