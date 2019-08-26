package cn.zmy.day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
	public static void main(String[] args) {
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
		String regex = "\\b\\w{3}\\b";

		Pattern p = Pattern.compile(regex);// 编译后内容为：\b\w{3}\b
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(m.group());
		}
		
		String s2 = "jj kk ll mm opq";
		String regex2 = "\\b\\w{2}\\b";
		Pattern p2 = Pattern.compile(regex2);
		Matcher m2 = p2.matcher(s2);
		while (m2.find()) {
			System.out.println(m2.group());
		}
	}
}
