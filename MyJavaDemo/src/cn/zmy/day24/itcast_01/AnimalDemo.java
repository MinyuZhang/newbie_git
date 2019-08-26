package cn.zmy.day24.itcast_01;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal dog = AnimalFactory.createAnimal("dog");
		Animal cat = AnimalFactory.createAnimal("cat");
		dog.eat();
		cat.eat();
	}
}
