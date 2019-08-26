package cn.zmy.day24.itcast_02;

public class DoggFactory implements Factory {

	public Animal createAnimal() {
		return new Dog();
	}

}
