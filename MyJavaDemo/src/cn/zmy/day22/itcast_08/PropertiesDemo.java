package cn.zmy.day22.itcast_08;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/*
 * Properties:属性集合类。是一个可以和IO流相结合使用的集合类。
 * Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。 
 * 
 * 是Hashtable的子类，说明是一个Map集合。
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("lyrics", "sad");
		prop.put("experience", "meaningful");
		prop.put("type", "tiny");
		Set<Entry<Object, Object>> entry = prop.entrySet();
		for (Entry<Object, Object> entry2 : entry) {
			System.out.println(entry2.getKey() + "--" + entry2.getValue());
		}
		System.out.println(prop);
	}
}
