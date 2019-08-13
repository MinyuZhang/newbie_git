package cn.zmy.day24.itcast_02;

public class CatsFactory implements Factory {

	public Animal createAnimal() {
		return new Cat();
	}

}
