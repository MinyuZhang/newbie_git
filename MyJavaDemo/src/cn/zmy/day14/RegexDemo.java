package cn.zmy.day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取功能
 *		Pattern和Matcher类的使用
 *		
 *		模式和匹配器的基本使用顺序
 */
public class RegexDemo {
	public static void main(String[] args) {
		// 模式和匹配器的典型调用顺序
		// 把正则表达式编译成模式对象
		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaaaab");
		while (m.find()) {
			System.out.println(m.group());
		}
		boolean b = m.matches();
		System.out.println(b);
		
		String s = "aaaaab";
		String regex = "a*b";
		boolean bb = s.matches(regex);
		System.out.println(bb);
	}
}
