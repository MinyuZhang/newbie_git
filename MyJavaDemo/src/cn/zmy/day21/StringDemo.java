package cn.zmy.day21;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
		String str = "ISpentMyWholeLifeTryingNotToBeCareless, womenAndChildrenCanBeCareless, butNotMen";
		try {
			byte []byt = str.getBytes();
			byte []byt2 = str.getBytes("GBK");
			byte []byt3 = str.getBytes("UTF-8");
			System.out.println(Arrays.toString(byt));
			System.out.println(Arrays.toString(byt2));
			System.out.println(Arrays.toString(byt3));
			
			String str1 = new String("HastaLaVista");
			String str2 = new String("卍".getBytes("GBK"), "GBK");
			String str3 = new String("卐".getBytes("UTF-8"), "UTF-8");
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
