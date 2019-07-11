package cn.zmy.day11;

interface A {
	int x = 0;
}

class B {
	int x = 1;
}

class C extends B implements A {
	public void printX() {
		//在接口和类中定义成员变量、常量时，
		//要避免重名，
		//The field x is ambiguous.
//		System.out.println(x);
	}
}

public class Otherthing {
	public static void main(String[] args) {

	}
}
