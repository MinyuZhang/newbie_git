package cn.zmy.day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A:创建一个牌盒 B:装牌 C:洗牌 D:发牌 E:看牌
 * 
 * @author zmy
 *
 */
public class PokerDemo {
	public static void main(String[] args) {
		/**
		 * A:创建一个牌盒
		 */
		List<String> array = new ArrayList<String>();//牌盒
		/**
		 * B:装牌
		 */
		String []pattern = {"♠", "♥", "♦", "♣"};//花色
		String []num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		for (String p : pattern) {
			for (String string : num) {
				array.add(p.concat(string));
			}
		}
		array.add("小王");
		array.add("大王");
		/**
		 * C:洗牌
		 */
		Collections.shuffle(array);
//		System.out.println(array);
		/**
		 * D:发牌
		 */
		List<String> xm = new ArrayList<String>();//小明
		List<String> xf = new ArrayList<String>();//小芳
		List<String> my = new ArrayList<String>();//敏宇
		
		for (int i = 0; i < array.size() - 2; i += 3) {
			xm.add(array.get(i));
			xf.add(array.get(i + 1));
			my.add(array.get(i + 2));
		}
		/**
		 * 看牌
		 */
		System.out.println("小明的牌：" + xm);
		System.out.println("小芳的牌：" + xf);
		System.out.println("敏宇的牌：" + my);
	}

}
