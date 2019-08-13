package cn.zmy.day24.itcast_01;

public class AnimalFactory {
	public static Animal createAnimal(String string) {
		if ("dog".equals(string)) {
			return new Dog();
		} else if ("cat".equals(string)) {
			return new Cat();
		}
		return null;
	}
}
