package cn.zmy.Day03;

import java.util.Scanner;

public class Operators3 {
	public static void main(String[] args) {
		boolean flag = true;
		if (flag == false) {
			System.out.println("a");
		} else if (flag) {
			System.out.println("b");
		} else if (!flag) {
			System.out.println("c");
		} else {
			System.out.println("d");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要评定的成绩：");
		double score = sc.nextDouble();
		
		if (score >=90 && score <=100) {
			System.out.println("成绩A等");
		} else if (score >=80 && score <=89) {
			System.out.println("成绩B等");
		} else if (score >=70 && score <=79) {
			System.out.println("成绩C等");
		} else if (score >=60 && score <=69) {
			System.out.println("成绩D等");
		} else {
			System.out.println("成绩E等");
		}
		sc.close();
	}
}
