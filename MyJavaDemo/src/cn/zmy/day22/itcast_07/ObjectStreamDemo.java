package cn.zmy.day22.itcast_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 序列化流：把对象按照流一样的方式存入文本文件或者在网络中传输。对象 -- 流数据(ObjectOutputStream)
 * 反序列化流:把文本文件中的流对象数据或者网络中的流对象数据还原成对象。流数据 -- 对象(ObjectInputStream)
 */
public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		write();
		read();
	}
	
	public static void write() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("E:\\Documents\\files\\Object.txt")
				);
		Person p1 = new Person("菩提", 23, "6200", 'A');
		Person p2 = new Person("如来", 40, "3800", 'B');
		
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
		
	}
	
	public static void read() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("E:\\Documents\\files\\Object.txt")
				);
		Object obj = ois.readObject();
		Object obj2 = ois.readObject();
//		Object obj3 = ois.readObject();
//		Object obj4 = ois.readObject();
		System.out.println(obj);
		System.out.println(obj2);
//		System.out.println(obj3);
//		System.out.println(obj4);
		ois.close();
	}
}
