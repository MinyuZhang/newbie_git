package cn.zmy.day22.itcast_08;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("cellphone", "iPhoneXR");
		prop.setProperty("color", "scarlet");
		prop.setProperty("ram", "128G");
		prop.setProperty("rom", "4G");
		
		Set<String> set = prop.stringPropertyNames();
		for (String string : set) {
			System.out.println(string + "--" + prop.getProperty(string));
		}
	}
}

/*
 * class Hashtalbe<K,V> { public V put(K key,V value) { ... } }
 * 
 * class Properties extends Hashtable { public V setProperty(String key,String
 * value) { return put(key,value); } }
 */